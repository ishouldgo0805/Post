import WallService.add
import WallService.comments
import WallService.posts
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {

        if (posts.isNotEmpty()) {
            posts = emptyArray()
        } else

        //assert
            assertEquals(Post(1), add(Post(1)))

    }

    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(
            Post(1)
        )
        service.add(
            Post(2)
        )
        service.add(
            Post(3)
        )
        // создаём информацию об обновлении
        val update = Post(1)

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
        service.add(
            Post(1)
        )
        service.add(
            Post(2)
        )
        service.add(
            Post(3)
        )
        // создаём информацию об обновлении
        val update = Post(1)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        // здесь код с вызовом функции, которая должна выкинуть PostNotFoundException
        WallService.createComment(8, Comment())
    }

    @Test
    fun createComment() {
        if (comments.isNotEmpty()) {
            comments = emptyArray()
        } else WallService.createComment(1, Comment())
        //assert
            assertEquals(Comment(1), WallService.createComment(1, Comment(1)))

    }
}