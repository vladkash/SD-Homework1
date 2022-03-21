package ru.itmo.sd.shell.exception

import ru.itmo.sd.shell.parser.Token

class UndefinedVariableException(name: String) : Exception("Variable '$name' is not defined")

class UnexpectedTokenException(token: Token) : Exception("Token $token was not expected")

class IllegalCommandArgumentException(override val message: String?) : Exception()

class ExecutionFailureError(
    exitCode: Int,
    override val cause: Throwable? = null
) : Throwable("Execution terminated with exit code $exitCode")