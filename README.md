# Powerball Analysis in Java (OOP Edition)

This project analyzes historical **Powerball winning numbers** using a clean, Object Oriented Programming (OOP) architecture in Java.  
It demonstrates real world software design concepts such as **data modeling**, **service abstraction**, **encapsulation**, **separation of concerns**, and **file parsing**.

The result: the program identifies the **most frequently drawn numbers** for each of the 5 main Powerball pick positions.


## Features

- Object-Oriented Java design (model → service → loader → main)
- Reads and parses a CSV dataset of historical Powerball results
- Counts number frequency **by pick position** (1st through 5th number)
- Ranks and displays the **top N numbers** for any position
- Modular and easily extendable architecture


## Project Structure

```markdown

src/
└── lottery/
    ├── Main.java                   # Application entry point
    │
    ├── model/
    │   └── NumberFrequency.java    # Represents a number + its frequency
    │
    └── service/
        ├── PowerballDataLoader.java      # Loads & parses CSV data
        └── PowerballAnalysisService.java # Analyzes frequencies and rankings
```
---

## Dataset

Data source:  
**Powerball Winning Numbers (Beginning 2010)** from Data.gov  
(Original dataset includes date, winning numbers, powerball, and multiplier.)

### Cleaning steps:
- Removed the **Powerball number** and **Power Play multiplier**  
- Kept only the 5 main numbers used for positional analysis  
- Converted into a simplified CSV stored in the project resources  
- Only the “Winning Numbers” column is used for this program


## How the Program Works

1. PowerballDataLoader opens and reads the CSV file from the resources folder  
2. Each row is parsed, splitting the “Winning Numbers” into **five picks**  
3. The program builds five frequency maps one for each position  
4. PowerballAnalysisService sorts the frequencies and finds the **top N numbers**  
5. The Main class prints the results in a clean, readable format
