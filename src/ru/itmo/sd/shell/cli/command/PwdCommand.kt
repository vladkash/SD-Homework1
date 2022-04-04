package ru.itmo.sd.shell.cli.command

import ru.itmo.sd.shell.cli.util.ExecutionResult
import ru.itmo.sd.shell.cli.util.execution
import ru.itmo.sd.shell.environment.Environment

class PwdCommand(
    override val arguments: List<String> = emptyList()
) : CliSimpleCommand() {

    override val name: String = "pwd"

    override fun execute(env: Environment): ExecutionResult = execution {
        writeLine(env.getPwd())
    }
}
