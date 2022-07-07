object WallService {
    var posts = emptyArray<Post>()

    var postID = 0

    fun add(post: Post): Post {
        postID++
        posts += post
        return posts.last()
    }
    fun update(post: Post): Boolean {
        for((index, item) in posts.withIndex()) {
            if (item.id == post.id) {
                posts[index] = post
                return true
            }
        }
        return false
    }
}


