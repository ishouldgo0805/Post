import WallService.add
import WallService.postID
import WallService.posts
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        // act
        add(Post(1))

        //assert
        assertEquals(4, postID)

    }

    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(Post(1,4))
        service.add(Post(2,5))
        service.add(Post(3,6))
        // создаём информацию об обновлении
        val update = Post(1,4)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun updateNotExisting() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(Post(1,4))
        service.add(Post(2,5))
        service.add(Post(3,6))
        // создаём информацию об обновлении
        val update = Post(1,8)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }
}