
fun main() {

    val post1 = Post()

    val comment1 = Comment()

    WallService.add(post1)

    println((WallService.createComment(1, comment1)))

}

