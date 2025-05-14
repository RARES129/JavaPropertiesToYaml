# JavaPropertiesToYaml

A simple Java utility that converts `.properties` files into `.yaml` format using the SnakeYAML library.

---

## 📌 Description

`JavaPropertiesToYaml` is a command-line tool designed to convert Java-style `.properties` configuration files into YAML format. This can be useful for projects transitioning to YAML-based configurations or for improving readability and structure in configuration files.

---

## 🎯 Motivation

Properties files are widely used in Java applications, but they are flat and lack the structural flexibility of YAML. YAML is often preferred in modern applications, especially in frameworks like Spring Boot, due to its readability and hierarchical structure. This tool bridges the gap by automating the conversion.

---

## ✅ Goal

- Parse a `.properties` file
- Transform its key-value pairs into a well-formatted `.yaml` file
- Ensure the output maintains consistent structure and readability
- Provide a clean, CLI-based interface for easy usage

---

## ⚙️ Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/JavaPropertiesToYaml.git
   cd JavaPropertiesToYaml
   ```

2. Ensure you have [Maven](https://maven.apache.org/) and JDK 21 installed.

3. Build the project:
   Open Command Prompt
   ```bash
   mvn compile
   ```

---

## 🚀 Usage

### 🛠 Requirements

- Java 21+
- Maven
- `application.properties` file (input)
- Output path for `application.yaml`

### ▶ Run the application

From the root directory (where `pom.xml` is located), use:
Open Command Prompt

```bash

mvn exec:java -Dexec.args="src/main/resources/application.properties src/main/resources/application.yaml"
```

## 📂 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── org/example/JavaPropertiesToYaml.java
│   └── resources/
│       ├── application.properties
│       └── application.yaml
pom.xml
README.md
```
