import sys
from PySide6.QtWidgets import *
from PySide6.QtCore import *
import pytube
from ui_Lab3_HW_UI import Ui_MainWindow

class MultiTaskerUi(QMainWindow):
    def __init__(self):
        QMainWindow.__init__(self, None)

        self.ui = Ui_MainWindow()
        self.ui.setupUi(self)

        self.ui.dowload_Button.clicked.connect(self.ytDownload)

    def ytDownload(self):
        link = input(self.ui.link)
        yt = pytube.YouTube(link)
        yt.streams.first().download()

        dialog = QDialog(self)
        layout = QVBoxLayout()
        label = QLabel(self)

        label.setText("DONE DOWNLOADING")
        layout.addWidget(label)

        close_button = QPushButton('OK', self)
        close_button.clicked.connect(dialog.close)
        layout.addWidget(close_button)
        dialog.setLayout(layout)

        dialog.show()

if __name__ == "__main__":
    app = QApplication(sys.argv)
    w = MultiTaskerUi()
    w.show()
    sys.exit(app.exec())