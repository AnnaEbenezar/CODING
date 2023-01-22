import sys
from PySide6.QtWidgets import *
from PySide6.QtCore import *

class Converter_window(QWidget):
    def __init__(self):
        QWidget.__init__(self, None)

        vbox = QVBoxLayout()
        self.label = QLabel(self)
        self.label.setText("Your Amount: ")
        vbox.addWidget(self.label)

        self.amt_entry = QLineEdit(self)
        self.amt_entry.setText("0.00")
        vbox.addWidget(self.amt_entry)

        thb_usd = QPushButton('THB -> USD', self)
        thb_usd.clicked.connect(self.converter)
        vbox.addWidget(thb_usd)

        usd_thb = QPushButton('USD -> THB', self)
        usd_thb.clicked.connect(self.converter)
        vbox.addWidget(usd_thb)

        self.setLayout(vbox)
        self.show()

    def converter(self):
        text = self.sender().text()
        if text == 'THB -> USD':
            dialog = QDialog(self)
            layout = QVBoxLayout()
            value = float(self.amt_entry.text())

            label = QLabel(self)
            label.setText(f"{value:.02f} THB is {value/30:.02f} USD")
            layout.addWidget(label)

            close_button = QPushButton('Close Window', self)
            close_button.clicked.connect(dialog.close)
            layout.addWidget(close_button)
            dialog.setLayout(layout)

            dialog.show()
        else:
            dialog = QDialog(self)
            layout = QVBoxLayout()
            value = float(self.amt_entry.text())

            label = QLabel(self)
            label.setText(f"{value:.02f} USD is {value*30:.02f} THB")
            layout.addWidget(label)

            close_button = QPushButton('Close Window', self)
            close_button.clicked.connect(dialog.close)
            layout.addWidget(close_button)
            dialog.setLayout(layout)

            dialog.show()

            """ dialog = QDialog(self)
            layout = QVBoxLayout()

            label = QLabel(self)
            label.setText("Hi " + self.name_entry.text())
            layout.addWidget(label)

            close_button = QPushButton('Close Window', self)
            close_button.clicked.connect(dialog.close)
            layout.addWidget(close_button)
            dialog.setLayout(layout)

            dialog.show()
 """
if __name__ == '__main__':
    app = QApplication(sys.argv)

    w = Converter_window()
    w.setWindowTitle('Simple Converter')
    
    sys.exit(app.exec())