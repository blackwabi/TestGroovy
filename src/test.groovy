/**
 * Created by martinbegleiter on 13/03/16.
 */

def resistance = 10

def current = 10

// Example of closure
// Note that you can define parameters and that you do not need a return statement.
// The last line of the closure is evaluated and returned as the result if no return
// statement is written.
def voltage = {res, cur -> res * cur}


// Example of how a closure can use variables defined in the scope in which the closure is defined
def voltageUsingScope = {
    resistance * current
}

// Shows how to "call" a closure by using ()
// Also shows how to include variables in GStrings
def closureResult = voltage(resistance, current)
println "The voltage is $closureResult"

def scopeClosureResult = voltageUsingScope()
println "The voltage using scope is $scopeClosureResult}"


// Shows that every closure has it as a default parameter if no other parameter is named
def noParameterClosure = {
    println "I got $it"
}
noParameterClosure()
noParameterClosure("Hello")


// This shows how we can define a closure and then, since it is a first class citizen, send it in as a parameter to
// another closure
def transform = {x,y ->
    2*x + y
}

def applyTransformToParams(trans, first, second) {
    def result = trans(first, second)
    println "The result of the transform is = $result"
}

applyTransformToParams(transform, 4, 5)

