
fun main() {

    var photo1 = Photo("Photo", 1,2,3,4)
    var photo2 = Photo("Photo", 2,2,3,4)
    var photo3 = Photo("Photo", 3,2,3,4)
    var audio1 = Audio()


    var post1 = Post(ownerId = 7, attachments = arrayOf(photo1,photo2,photo3, audio1), copyHistory = arrayOf(""), donut = null, geo = null, postSource = null)

}

