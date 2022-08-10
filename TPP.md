# Transformation Priority Premise

- ({} → nil) no code at all → code that employs nil
- (nil → constant)
- (constant → constant+) a simple constant to a more complex constant
- (constant → scalar) replacing a constant with a variable or an argument
- (statement → statements) adding more unconditional statements.
- (unconditional → if) splitting the execution path
- (scalar → array)
- (array → container)
- (statement → tail-recursion)
- (if → while)
- (statement → non-tail-recursion)
- (expression → function) replacing an expression with a function or algorithm
- (variable → assignment) replacing the value of a variable.
- (case) adding a case (or else) to an existing switch or if