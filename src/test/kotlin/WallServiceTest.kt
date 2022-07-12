import WallService.add
import WallService.posts
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {

        if (posts.isNotEmpty()) {
            posts = emptyArray<Post>()
        } else

        //assert
        assertEquals(Post(1,4,1,1,1u,"Post",1,1,true,1,1,1u,1, 1,"Normal", null, emptyArray<Attachments>() ,1,1,emptyArray<String>(),true,false,true,true,true,true,null,1), add(Post(1,4,1,1,1u,"Post",1,1,true,1,1,1u,1, 1,"Normal", null, emptyArray<Attachments>() ,1,1,emptyArray<String>(),true,false,true,true,true,true,null,1)))

    }

    @Test
    fun updateExisting() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(Post(1,4,1,1,1u,"Post",1,1,true,1,1,1u,1, 1,"Normal", null, emptyArray<Attachments>() ,1,1,emptyArray<String>(),true,false,true,true,true,true,null,1))
        service.add(Post(2,5,1,1,1u,"Post",1,1,true,1,1,1u,1, 1,"Normal", null, emptyArray<Attachments>() ,1,1,emptyArray<String>(),true,false,true,true,true,true,null,1))
        service.add(Post(3,6,1,1,1u,"Post",1,1,true,1,1,1u,1, 1,"Normal", null, emptyArray<Attachments>() ,1,1,emptyArray<String>(),true,false,true,true,true,true,null,1))
        // создаём информацию об обновлении
        val update = Post(1,4,1,1,1u,"Post",1,1,true,1,1,1u,1, 1,"Normal", null, emptyArray<Attachments>() ,1,1,emptyArray<String>(),true,false,true,true,true,true,null,1)

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
        service.add(Post(1,4,1,1,1u,"Post",1,1,true,1,1,1u,1, 1,"Normal", null, emptyArray<Attachments>() ,1,1,emptyArray<String>(),true,false,true,true,true,true,null,1))
        service.add(Post(2,5,1,1,1u,"Post",1,1,true,1,1,1u,1, 1,"Normal", null, emptyArray<Attachments>() ,1,1,emptyArray<String>(),true,false,true,true,true,true,null,1))
        service.add(Post(3,6,1,1,1u,"Post",1,1,true,1,1,1u,1, 1,"Normal", null, emptyArray<Attachments>() ,1,1,emptyArray<String>(),true,false,true,true,true,true,null,1))
        // создаём информацию об обновлении
        val update = Post(1,8,1,1,1u,"Post",1,1,true,1,1,1u,1, 1,"Normal", null, emptyArray<Attachments>() ,1,1,emptyArray<String>(),true,false,true,true,true,true,null,1)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }
}