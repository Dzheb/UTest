package seminar4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

//Задание 1. Ответьте письменно на вопросы:
//
//        1)  Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
//        Использование тестовых заглушек снижает сложность тестов и позволяет проверять код независимо от остальной системы.
//
//        2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?
//        Stub заглушки
//
//        3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?
//        Mock заглушки
//
//        4) Какой тип тестовой заглушки вы бы использовали для имитации  взаимодействия с внешним API или базой данных?
//        Fake заглушки


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

