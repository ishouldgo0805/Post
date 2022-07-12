abstract class Attachments {
    abstract var type: String
}

abstract class PhotoAttachment() : Attachments() {
    override var type: String = "Photo Attachment"
    open val id: Int = 0

}


class Photo(
    override var type: String = "Photo",
    override val id: Int = 1,
    val albumId: Int = 2,
    val ownerId: Int = 3,
    val userId: Int = 4,
    val text: String = "",
    val date: Int = 1,
    val sizes: Int = 1,
    val width: Int = 1,
    val height: Int = 1
) : PhotoAttachment()

class PostedPhoto(
    override var type: String = "Posted Photo",
    override val id: Int = 1,
    val photo130: String = "",
    val photo640: String = "",

) : PhotoAttachment()

class Graffiti(
    override var type: String = "Graffiti",
    override val id: Int = 1,
    val photo130: String = "",
    val photo640: String = "",

    ) : PhotoAttachment()

class Album(
    override var type: String = "Album",
    override val id: Int = 1,
    val ownerId: Int = 1,
    val thumb: String = "",
    val title: String = "",
    val description: String = "",
    val created: Int = 1,
    val updated: Int = 1,
    val size: Int = 1,
) : PhotoAttachment()


abstract class AudioAttachment() : Attachments() {
    override var type: String = "Audio Attachment"
    open val id: Int = 0
    open val albumId: Int = 0
    open val ownerId: Int = 0

}

class Audio(
    override var type: String = "Audio",
    override val id: Int = 1,
    override val albumId: Int = 1,
    override val ownerId: Int = 1,
    val artist: String = "",
    val title: String = "",
    val duration: Int = 1,
    val url: String = "",
    val genreId: Int = 1,
    val date: Int = 1,
    val noSearch: Boolean = true,
    val isHd: Boolean = true
) : AudioAttachment()