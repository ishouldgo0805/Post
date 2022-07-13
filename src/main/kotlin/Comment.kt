data class Comment(
    var id: Int = 0,
    var fromId: Int = 0,
    var date: Int = 0,
    var text: String = "",
    var donut: Boolean = false,
    var replyToUser: Int = 0,
    var replyToComment: Int = 0,
    var attachments: Attachments? = null,
    var parentsStack: Array<Int>? = null,
    var thread: Any? = null

)