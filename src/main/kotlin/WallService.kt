@file:Suppress("NAME_SHADOWING")

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
        val addedComment = comment.copy()
        if (posts.contains(Post(id = postId))) {
            comments.plusElement(addedComment)

        } else throw PostNotFoundException()
        return addedComment
    }
}


class PostNotFoundException() : Exception() {
}







