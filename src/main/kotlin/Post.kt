import com.sun.org.apache.xpath.internal.operations.Bool
import java.util.Objects

data class Post(
    var id: Int = 1,
    val ownerId: Int = 1,
    val fromId: Int = 2,
    val createdBy: Int = 3,
    val date: UInt = 4U,
    val text: String = "Post",
    val replyOwnerId: Int = 5,
    val replyPostId: Int = 6,
    val friendsOnly: Boolean = true,
    val comments: Int = 1,
    val copyright: Int = 1,
    val likes: UInt = 1u,
    val reposts: Int = 1,
    val views: Int = 1,
    val postType: String = "Normal",
    val singerID: Int = 7,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = true,
    val isFavorite: Boolean= true,
    val donut: Boolean = true,
    val postponedId: Int = 8
)