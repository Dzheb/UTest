package seminar4;

import org.mockito.Mock;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

public class Test {

        public static void main(String[] args) {
            LinkedList mockedLinkedList = mock(LinkedList.class);
            verify(mockedLinkedList).get(0);
            when(mockedLinkedList.get(0)).thenReturn("nullValue");
// Выведет "nullValue"
            System.out.println(mockedLinkedList.get(0));
//            verify(mockedLinkedList).get(0);
            when(mockedLinkedList.get(1)).thenThrow(new RuntimeException("нет такого элемента"));
// Вернет исключение runtime exception
            System.out.println(mockedLinkedList.get(1));
            mockedLinkedList.clear();
// Создание mock

            List mockedList = mock(List.class);
// Использование
            mockedList.add("one");
            mockedList.clear();
        }
    }

