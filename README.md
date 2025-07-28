# 🧾 Invoice Generator 

A beginner-friendly, console-based invoice generator developed in Java that takes item details and produces a professionally formatted invoice. Perfect for demonstrating foundational skills in arrays, input/output formatting, tax and discount logic, and time-stamping.

---

## 📋 Features

- Dynamic item entry (name, unit price, quantity)
- Tax and discount input with live calculation
- Neatly formatted invoice using `System.out.printf()`
- Auto-generated date and time stamp
- Note section with currency information
- Modular structure ready for future OOP expansion

---

## 🛠️ Technologies Used

- **Java** (JDK 24.0.2)
- **Scanner** class for input handling
- **Console-based** input/output
- `Scanner`, `Date`, and formatted printing (`printf`)
- **Formatted output** using `printf` for professional presentation  

---

## 🚀 Getting Started

### Requirements
- Java Development Kit (JDK)
- Any Java IDE (e.g., IntelliJ IDEA, VS Code, NetBeans)

### How to Run

1. Clone this repository or download the `InvoiceGenerator.java` file.  

   ```bash
   git clone https://github.com/crm16/Invoice-Generator.git  
3. Open your terminal or IDE.
4. Compile the program:
   ```bash
   javac InvoiceGenerator.java  
5. Run the program:
   ```bash
   java InvoiceGenerator  

---

## 📷 Sample Input and Output

### Sample Input:  

    Enter number of items: 2  

    Enter name of item 1: Pen  
    Enter unit price of Pen: 100  
    Enter quantity of Pen: 4  

    Enter name of item 2: Book  
    Enter unit price of Book: 750  
    Enter quantity of Book: 2  

    Enter amount of tax [in %]: 18  
    Enter amount of discount [in %]: 2  

### Sample Output:
    
    ============================================================================
                                 INVOICE
    ----------------------------------------------------------------------------
    |S.NO| |ITEM NAME|               |UNIT PRICE| |QUANTITY| |TOTAL PRICE|
    ----------------------------------------------------------------------------
      1       Pen                      100.00          4         400.00
      2       Book                     750.00          2         1500.00
    ____________________________________________________________________________
    Sub-total [without tax]                                      1900.00
    Tax @ 18.00%                                                 342.00
    ----------------------------------------------------------------------------
    Net Payable Amount                                           2242.00
    Applicable Discount @ 2.00%                                  44.84
    ----------------------------------------------------------------------------
    Grand Total Payable                                          2197.16
    ----------------------------------------------------------------------------

    --------------NOTE--------------
        ** Prices are in INR. **
    --------------------------------

                              Generated on: Mon Jul 28 20:40:53 IST 2025
    ============================================================================

---

## 📂 File Structure
<pre>
Invoice-Generator/  
├── InvoiceGenerator.java  
└── README.md  
</pre>  

---

## 💡 Use Cases
- Personal billing simulations
- Academic projects (Java input/output formatting)
- Training beginners

---

## 📌 Future Enhancements

- Add company name/logo as optional header
- Export invoice to `.txt` or `.pdf`
- Integrate date formatting (`SimpleDateFormat`)
- GUI version using JavaFX or Swing

---

## 🧑‍💻 Author

Created by [**CHANDRARIT**](https://github.com/crm16)  
B.Tech in Computer Science,  
Netaji Subhash Engineering College  

---

## 📄 License
This project is open-source.

---

## 📬 Feedback
Questions or suggestions? Feel free to connect or fork this repo and build on it!
