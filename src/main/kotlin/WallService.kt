
object WallService {
    var posts = emptyArray<Post>()
    var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        val addedPost = post.copy()
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
        val updatedPost = post.copy(ownerId = post.ownerId, date = post.date)
        for ((index) in posts.withIndex()) {
            if (updatedPost.id == post.id) {
                posts[index] = updatedPost
                return true
            }
        }
        return false
    }
    fun createComment(postId: Int, comment: Comment): Comment {
        for (post in posts) {
            if (post.id == postId) comments.plusElement(comment) else throw PostNotFoundException()

        }
        return comment
    }

}

    class PostNotFoundException() : Exception() {
    }








