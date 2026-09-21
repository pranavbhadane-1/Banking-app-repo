# Banking App

This is a simple Java banking application that uses a custom package named `bank`.
The `Account` class handles account operations like deposit, withdrawal, and balance checking.
The `Main` class is placed in a different package and imports the `bank` package to work with multiple accounts.

## Project structure

- `src/bank/Account.java`
- `src/app/Main.java`

## Run the project

```bash
javac -d out src/bank/Account.java src/app/Main.java
java -cp out app.Main
```
