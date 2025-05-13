# AI-Powered Personal Finance Tracker

A modern Android application for tracking personal finances, built with Kotlin and Jetpack Compose. This app demonstrates advanced Android development concepts and modern architecture patterns.

## 🚀 Features

- Track income and expenses
- Categorize transactions
- Real-time financial summaries
- Modern Material 3 UI
- Dark/Light theme support
- Offline data persistence
- Responsive design

## 🛠 Technical Stack

### Architecture & Design Patterns
- **MVVM Architecture**
  - Model Layer (Data Models, Repository)
  - View Layer (Jetpack Compose UI)
  - ViewModel Layer (Business Logic)

- **Clean Architecture**
  ```
  Project Structure
  ├── data
  │   ├── local (Database)
  │   ├── model (Entities)
  │   └── repository (Data Operations)
  ├── ui
  │   ├── screens (UI Components)
  │   ├── theme (Styling)
  │   └── viewmodel (Business Logic)
  └── di (Dependency Injection)
  ```

### Technologies
- **UI**
  - Jetpack Compose
  - Material 3
  - Navigation Component
  - Custom Composable Components

- **Data Management**
  - Room Database
  - Coroutines
  - Flow
  - Repository Pattern

- **Dependency Injection**
  - Hilt
  - Hilt Navigation Compose

- **Testing**
  - JUnit
  - Espresso
  - Compose Testing

## 🏗 System Architecture

### Data Flow
```
UI Layer (Compose) → ViewModel → Repository → Database
```

### Dependency Graph
```
Application
├── Hilt Module
│   ├── Database Module
│   └── Repository Module
├── ViewModel
└── UI Components
```

## 💻 Code Examples

### State Management
```kotlin
// ViewModel State Management
private val _transactions = MutableStateFlow<List<Transaction>>(emptyList())
val transactions: StateFlow<List<Transaction>> = _transactions.asStateFlow()
```

### Repository Pattern
```kotlin
class TransactionRepository @Inject constructor(
    private val transactionDao: TransactionDao
) {
    fun getAllTransactions(): Flow<List<Transaction>>
    suspend fun insertTransaction(transaction: Transaction)
    // ... other operations
}
```

### Dependency Injection
```kotlin
@HiltViewModel
class TransactionViewModel @Inject constructor(
    private val repository: TransactionRepository
) : ViewModel()
```

## 🚀 Getting Started

### Prerequisites
- Android Studio Arctic Fox or newer
- JDK 17
- Android SDK 34
- Kotlin 1.9.0

### Installation
1. Clone the repository
```bash
git clone https://github.com/yourusername/finance-tracker.git
```

2. Open the project in Android Studio

3. Sync project with Gradle files

4. Run the app on an emulator or physical device

## 🧪 Testing

The project includes:
- Unit tests for ViewModel
- Integration tests for Repository
- UI tests for Compose components

Run tests using:
```bash
./gradlew test
```

## 📦 Dependencies

```gradle
// Core Android
implementation 'androidx.core:core-ktx:1.12.0'
implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.6.2'
implementation 'androidx.activity:activity-compose:1.8.1'

// Compose
implementation "androidx.compose.ui:ui:$compose_version"
implementation "androidx.compose.material3:material3:1.1.2"
implementation "androidx.compose.ui:ui-tooling-preview:$compose_version"

// Room
implementation "androidx.room:room-runtime:$room_version"
implementation "androidx.room:room-ktx:$room_version"
kapt "androidx.room:room-compiler:$room_version"

// Hilt
implementation "com.google.dagger:hilt-android:$hilt_version"
kapt "com.google.dagger:hilt-android-compiler:$hilt_version"
```

## 🎯 Design Patterns

### Repository Pattern
- Abstracts data sources
- Single source of truth
- Clean API for data operations

### Observer Pattern
- StateFlow for reactive updates
- LiveData for lifecycle-aware updates

### Dependency Injection
- Hilt for service location
- Constructor injection
- Module-based configuration

## 📊 Performance Considerations

- Efficient database queries
- Lazy loading with LazyColumn
- Coroutine scoping
- StateFlow optimization

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

Ansuman Das
- GitHub: [@Ansuman](https://github.com/AnsumanGeek123)

## 🙏 Acknowledgments

- Material Design 3
- Jetpack Compose
- Android Architecture Components
- Hilt
- Room Database

## 📞 Contact

Contact Linkdln - [@Ansuman](https://www.linkedin.com/in/ansuman-das-90a9a0226/)
Project Link: [# AI-Powered Personal Finance Tracker](https://github.com/AnsumanGeek123/AI-Finace-Tracker)

A modern Android application for tracking personal finances, built with Kotlin and Jetpack Compose. This app demonstrates advanced Android development concepts and modern architecture patterns.
