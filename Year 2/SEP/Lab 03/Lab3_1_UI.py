# -*- coding: utf-8 -*-

################################################################################
## Form generated from reading UI file 'Lab3_1_UI.ui'
##
## Created by: Qt User Interface Compiler version 6.4.2
##
## WARNING! All changes made in this file will be lost when recompiling UI file!
################################################################################

from PySide6.QtCore import (QCoreApplication, QDate, QDateTime, QLocale,
    QMetaObject, QObject, QPoint, QRect,
    QSize, QTime, QUrl, Qt)
from PySide6.QtGui import (QBrush, QColor, QConicalGradient, QCursor,
    QFont, QFontDatabase, QGradient, QIcon,
    QImage, QKeySequence, QLinearGradient, QPainter,
    QPalette, QPixmap, QRadialGradient, QTransform)
from PySide6.QtWidgets import (QApplication, QHBoxLayout, QPushButton, QSizePolicy,
    QWidget)

class Ui_Form(object):
    def setupUi(self, Form):
        if not Form.objectName():
            Form.setObjectName(u"Form")
        Form.resize(400, 300)
        self.horizontalLayout = QHBoxLayout(Form)
        self.horizontalLayout.setObjectName(u"horizontalLayout")
        self.hello_button = QPushButton(Form)
        self.hello_button.setObjectName(u"hello_button")
        font = QFont()
        font.setFamilies([u"Courier New"])
        font.setPointSize(36)
        font.setBold(True)
        self.hello_button.setFont(font)
        self.hello_button.setAutoFillBackground(False)

        self.horizontalLayout.addWidget(self.hello_button)


        self.retranslateUi(Form)

        QMetaObject.connectSlotsByName(Form)
    # setupUi

    def retranslateUi(self, Form):
        Form.setWindowTitle(QCoreApplication.translate("Form", u"Form", None))
        self.hello_button.setText(QCoreApplication.translate("Form", u"Say Hello!!!", None))
    # retranslateUi

