# refactored

## A
**Single Responsibility Principle (SRP)**: separate concerns of connection/disconnection.

**Open/Closed Principle (OCP)**: `connect()` and `disconnect()` are private (closed for modification), new db operations can be added without modifying existing connection logic (open for extension).

## B

*Rename properly*: Use more meaningful names.
- ``MyClass`` is renamed to `EmployeeManager` (`EmployeeOperations`, `EmployeeBean` and others are totally valid options.)
- ``function1() and function2()`` are respectively renamed to ``fireEmployee()`` and ``hireEmployee()``.

*Rename fast*:
This is specific to IntelliJ IDEA:
- For a single file: Press `Ctrl + R` to open the "Find and Replace" dialog.
- For the entire project/module/directory/scope: Press ``Ctrl + Shift + R`` to open the "Replace in Path" dialog.

## C

In a data-driven fashion, the ``Book`` class must only focus on representing the book's data, while the ``BookManager`` class handles operations related to managing books.
The ``Library`` class serves as a higher-level entity that might could potentially manage not just books but other resources as well.

## D
