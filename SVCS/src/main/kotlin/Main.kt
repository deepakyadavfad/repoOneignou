const val LENGTH_COMMAND_IN_MENU = 11

fun main(args: Array<String>) {
    val help = mapOf(
        "config" to "Get and set a username.",
        "add" to "Add a file to the index.",
        "log" to "Show commit logs.",
        "commit" to "Save changes.",
        "checkout" to "Restore a file."
    )

    when {
        args.isEmpty() || args[0] == "--help" -> {
            println("These are SVCS commands:")
            for (i in help.keys) {
                println("${i}${" ".repeat(LENGTH_COMMAND_IN_MENU - i.length)}${help[i]}")
            }
        }
        help.containsKey(args[0]) -> println(help[args[0]])
        else -> println("'${args[0]}' is not a SVCS command.")
    }
}