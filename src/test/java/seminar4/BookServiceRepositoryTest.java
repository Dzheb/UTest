package seminar4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

//У вас есть класс BookService, который использует интерфейс BookRepository
//для получения информации о книгах из базы данных(Коллекции).
//Ваша задача написать unit-тесты для BookService,
//используя Mockito для создания мок-объекта BookRepository.
public class BookServiceRepositoryTest {
    private InMemoryBookRepository inMemoryBookRepository;
    @BeforeEach
            void setup(){
        inMemoryBookRepository = new InMemoryBookRepository();
    }
    @Test
    void findByIdTest (){
        InMemoryBookRepository mockedInMemoryBookRepository =
                Mockito.spy(inMemoryBookRepository);
        //  получение данных из репозитория
        List<Book> books = this.inMemoryBookRepository.findAll();
        String realId = books.get(0).getId();
        String realAuthor = books.get(0).getAuthor();
        doCallRealMethod().when(mockedInMemoryBookRepository).findById(realId);
        // первый вызов findById для сравнения автора
        assert realAuthor == mockedInMemoryBookRepository.findById(realId).getAuthor();
        // второй вызов findById для сравнения автора
        System.out.println(mockedInMemoryBookRepository.findById(realId).getAuthor());
        verify(mockedInMemoryBookRepository,
                times(2)).findById(realId);
    }
    @Test
    void findAllTest (){
        InMemoryBookRepository mockedInMemoryBookRepository =
                Mockito.spy(inMemoryBookRepository);

        List<Book> books = this.inMemoryBookRepository.findAll();
        int realSize = books.size();
        doCallRealMethod().when(mockedInMemoryBookRepository).findAll();
        // первый вызов метода findAll()
       assert (realSize == mockedInMemoryBookRepository.findAll().size());
       //        проверка на количество вызовов 1
        verify(mockedInMemoryBookRepository,
                times(1)).findAll();
    }
}

