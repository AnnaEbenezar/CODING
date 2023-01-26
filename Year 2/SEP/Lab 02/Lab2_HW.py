import sys 
import random
from PySide6.QtCore import Qt, QTimer
from PySide6.QtWidgets import (QApplication, QLabel, QLineEdit,
                               QPushButton, QVBoxLayout, QWidget)

class Speed_Math_Test(QWidget):
    def __init__(self):
        QWidget.__init__(self, None)

        # Create the user interface
        self.problem_label = QLabel(self)
        self.answer_input = QLineEdit()
        self.check_button = QPushButton("Check")
        self.check_button.clicked.connect(self.check_answer)
        self.result_label = QLabel()
        self.timer_label = QLabel("Time Left: 30s")
        self.timer = QTimer()
        self.timer.timeout.connect(self.update_timer)
        self.timer.start(1000)

        layout = QVBoxLayout()
        layout.addWidget(self.problem_label)
        layout.addWidget(self.answer_input)
        layout.addWidget(self.check_button)
        layout.addWidget(self.result_label)
        layout.addWidget(self.timer_label)

        self.setLayout(layout)
        self.generate_problem()
        self.time_left = 30
        self.show()

    def generate_problem(self):
        # Generate a new math problem
        self.operations = ["+","-","*","/"]
        self.operation = random.choice(self.operations)
        num1 = random.randint(1, 10)
        num2 = random.randint(1, 10)
        self.problem = f"{num1} {self.operation} {num2} ="
        if self.operation == "+":
            self.answer = num1 + num2
        elif self.operation == "-":
            self.answer = num1 - num2
        elif self.operation == "*":
            self.answer = num1 * num2
        elif self.operation == "/":
            self.answer = num1 / num2
            self.answer = round(self.answer, 2)
        self.problem_label.setText(self.problem)

    def check_answer(self):
        # Check if the answer is correct
        user_answer = self.answer_input.text()
        if float(user_answer) == self.answer:
            self.result_label.setText("Correct!")
            self.answer_input.setText('')           
            self.generate_problem()
        else:
            self.result_label.setText("Incorrect.")
      
    def update_timer(self):
        self.time_left -= 1
        self.timer_label.setText(f"Time Left: {self.time_left}s")
        if self.time_left == 0:
            self.timer.stop()
            self.result_label.setText("Time's up!")
            self.check_button.setEnabled(False)

if __name__ == "__main__":
    app = QApplication()

    test = Speed_Math_Test()
    test.setWindowTitle('Speed Math Test')

    sys.exit(app.exec())
