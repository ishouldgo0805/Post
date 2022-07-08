object WallService {
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        var addedPost = post.copy()
        if (posts.isEmpty()) {
            addedPost.id = 1
            posts += addedPost
        } else {
            addedPost.id = posts.last().id + 1
            posts += addedPost
        }
        return addedPost
    }

    fun update(post: Post): Boolean {
        var updatedPost = post.copy(ownerId = post.ownerId, date = post.date)
        for ((index, post) in posts.withIndex()) {
            if (updatedPost.id == post.id) {
                posts[index] = updatedPost
                return true
            }
        }
        return false
    }
}





