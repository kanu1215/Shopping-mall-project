# 🛒 Shopping Mall Application – Java OOPs Project

This project is a **Java-based Shopping Mall Management System** demonstrating the use of **OOPs concepts** and **Factory Design Pattern**. It allows users to create **Prime** or **Normal** accounts and book products with or without delivery charges.

---

## 📁 Project Structure

ShoppingMallProject/
├── src/
│ ├── framework/ ← Abstract classes & base account structure
│ ├── application/ ← GS (Generic Shop) implementations
│ └── case_study/ ← Factory interface, main logic
├── bin/ ← Compiled .class files go here
└── README.md ← You're reading this!


---

## 🛠️ Technologies Used

- Java 17+
- OOPs Concepts
- Factory Design Pattern
- Package Structure
- VS Code (IDE)

---

## 💡 Key Concepts Implemented

- **Abstraction:** `ShopAcc` is an abstract class.
- **Inheritance:** `PrimeAcc` and `NormalAcc` inherit from `ShopAcc`.
- **Polymorphism:** `bookProduct()` is overridden based on account type.
- **Encapsulation:** Private/protected fields with getters/setters.
- **Interface:** `ShopFactory` used to create account objects.
- **Factory Pattern:** `GSShopFactory` creates account instances based on input.

---



📷 Sample Output
1.Prime Account output
![primeacc _img](https://github.com/user-attachments/assets/13a10b53-d221-43af-a9c0-8f463bd85a12)

2.Normal Account output
![normalacc_img](https://github.com/user-attachments/assets/479dfbbf-ff09-46f8-8220-d8a242ad243b)

