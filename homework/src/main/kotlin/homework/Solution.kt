package homework

enum class Genre(val label: String) {
    FANTASY("Фэнтези"),
    ADVENTURE("Приключения"),
    SCIENCE("Наука")
}

object LibraryRules {
    fun loanDays(genre: Genre): Int {
        TODO()
    }
}

class Book(
    val id: Int,
    val title: String,
    val author: String,
    val genre: Genre = Genre.FANTASY
) {
    var isAvailable: Boolean = true
        private set

    init {
        require(id > 0)
        require(title.isNotBlank())
        require(author.isNotBlank())
    }

    fun borrow(): Boolean {
        if (!isAvailable) {
            return false
        }
        isAvailable = false
        return true
    }

    fun returnToLibrary(): Boolean {
        if (isAvailable) {
            return false
        }
        isAvailable = true
        return true
    }

    fun info(): BookInfo {
        return BookInfo(title, author, genre)
    }
}

interface Notifier {
    fun send(message: String)
}

class Library(private val books: Array<Book>, private val notifier: Notifier) {
    fun hasBook(id: Int): Boolean {
        TODO()
    }

    fun borrowBook(id: Int): Boolean {
        TODO()
    }

    fun returnBook(id: Int): Boolean {
        TODO()
    }

    fun availableCount(): Int {
        TODO()
    }

    fun countByGenre(genre: Genre): Int {
        TODO()
    }

    fun report(): String {
        TODO()
    }
}
