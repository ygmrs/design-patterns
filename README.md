# Design Patterns

Java implementations of core object-oriented design patterns, focused on practical examples of reusable software design and clean separation of responsibilities.

## Overview

This repository contains compact Java examples of common design patterns used to solve recurring object-oriented design problems.

The current implementations focus primarily on **creational patterns**, along with selected structural examples.

## Implemented Patterns

### Creational

- **Abstract Factory** — creates families of related objects without coupling client code to concrete implementations
- **Builder** — separates complex object construction from its final representation
- **Factory** — encapsulates object creation behind a common creation interface
- **Singleton** — restricts a class to a single shared instance

### Structural

- **Decorator** — adds behavior to objects dynamically without modifying the underlying implementation

## Technical Focus

- Java
- Object-oriented programming
- Design patterns
- Abstraction
- Encapsulation
- Loose coupling
- Maintainable software design

## Repository Structure

```text
design-patterns/
├── src/
│   └── com/
│       └── company/
│           └── creationalDesignPatterns/
│               ├── abstractFactory/
│               ├── builder/
│               ├── decorator/
│               ├── factory/
│               └── singleton/
├── .gitignore
└── README.md
```

Each directory contains a focused implementation of a design pattern and demonstrates the responsibilities and interactions involved in that pattern.

## Purpose

This repository serves as a concise Java reference for foundational software design patterns and demonstrates how established object-oriented techniques can improve extensibility, readability, and maintainability.
