import sys
from PySide6.QtWidgets import *
from PySide6.QtCore import *
from Lab3_3_UI import Ui_Form

class CallUi(QMainWindow):
    def __init__(self):
        QMainWindow.__init__(self, None)

        self.ui = Ui_Form()
        self.ui.setupUi(self)

        self.text = ""

        self.ui.pushButton_0.clicked.connect(lambda x: self.pushButton_callback(0))
        self.ui.pushButton_1.clicked.connect(lambda x: self.pushButton_callback(1))
        self.ui.pushButton_2.clicked.connect(lambda x: self.pushButton_callback(2))    
        self.ui.pushButton_3.clicked.connect(lambda x: self.pushButton_callback(3))    
        self.ui.pushButton_4.clicked.connect(lambda x: self.pushButton_callback(4))    
        self.ui.pushButton_5.clicked.connect(lambda x: self.pushButton_callback(5))    
        self.ui.pushButton_6.clicked.connect(lambda x: self.pushButton_callback(6))    
        self.ui.pushButton_7.clicked.connect(lambda x: self.pushButton_callback(7))    
        self.ui.pushButton_8.clicked.connect(lambda x: self.pushButton_callback(8))    
        self.ui.pushButton_9.clicked.connect(lambda x: self.pushButton_callback(9))    
        self.ui.pushButton_star.clicked.connect(lambda x: self.pushButton_callback(-1))    
        self.ui.pushButton_hash.clicked.connect(lambda x: self.pushButton_callback(-2))
        
        self.ui.pushButton_back.clicked.connect(self.back_callback)
        self.ui.pushButton_Talk.clicked.connect(self.Talk_callback)
    
    def pushButton_callback(self, num):
        if num == -1:
            self.text += "*"
        elif num == -2:
            self.text += "#"
        else:
            self.text += str(num)
        
        self.ui.lineEdit.setText(self.text)
    
    def back_callback(self):
        if len(self.text) > 1:
            self.text = self.text[:-1]
        else:
            self.text = ""
        
        self.ui.lineEdit.setText(self.text)
    
    def Talk_callback(self):
        dialog = QDialog(self)
        layout = QVBoxLayout()
        label = QLabel(self)

        label.setText("Dialling " + self.text)
        layout.addWidget(label)

        close_button = QPushButton('OK', self)
        close_button.clicked.connect(dialog.close)
        layout.addWidget(close_button)
        dialog.setLayout(layout)

        dialog.show()



if __name__ == "__main__":
    app = QApplication(sys.argv)
    w = CallUi()
    w.show()
    sys.exit(app.exec())