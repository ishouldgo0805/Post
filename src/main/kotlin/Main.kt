fun main() {
    var post1 = Post(ownerId = 7)
    var post2 = Post(ownerId = 8)
    var post3 = Post(ownerId = 10)

    println(WallService.add(post1))
    println(WallService.add(post2))
    println(WallService.update(post2))
    println(post2)


}

