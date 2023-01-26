# -*- coding: utf-8 -*-

################################################################################
## Form generated from reading UI file 'Lab3_2_UI.ui'
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
from PySide6.QtWidgets import (QApplication, QLabel, QPushButton, QSizePolicy,
    QVBoxLayout, QWidget)

class Ui_Form(object):
    def setupUi(self, Form):
        if not Form.objectName():
            Form.setObjectName(u"Form")
        Form.resize(400, 300)
        self.num_label = QLabel(Form)
        self.num_label.setObjectName(u"num_label")
        self.num_label.setGeometry(QRect(30, 20, 161, 261))
        font = QFont()
        font.setFamilies([u"Courier New"])
        font.setPointSize(54)
        font.setBold(True)
        self.num_label.setFont(font)
        self.num_label.setAlignment(Qt.AlignCenter)
        self.widget = QWidget(Form)
        self.widget.setObjectName(u"widget")
        self.widget.setGeometry(QRect(220, 20, 171, 261))
        self.verticalLayout = QVBoxLayout(self.widget)
        self.verticalLayout.setObjectName(u"verticalLayout")
        self.inc_button = QPushButton(self.widget)
        self.inc_button.setObjectName(u"inc_button")
        sizePolicy = QSizePolicy(QSizePolicy.Minimum, QSizePolicy.Preferred)
        sizePolicy.setHorizontalStretch(0)
        sizePolicy.setVerticalStretch(0)
        sizePolicy.setHeightForWidth(self.inc_button.sizePolicy().hasHeightForWidth())
        self.inc_button.setSizePolicy(sizePolicy)
        font1 = QFont()
        font1.setFamilies([u"Courier New"])
        font1.setPointSize(50)
        font1.setBold(True)
        self.inc_button.setFont(font1)

        self.verticalLayout.addWidget(self.inc_button)

        self.reset_button = QPushButton(self.widget)
        self.reset_button.setObjectName(u"reset_button")
        sizePolicy.setHeightForWidth(self.reset_button.sizePolicy().hasHeightForWidth())
        self.reset_button.setSizePolicy(sizePolicy)
        font2 = QFont()
        font2.setFamilies([u"Courier New"])
        font2.setPointSize(35)
        font2.setBold(True)
        self.reset_button.setFont(font2)

        self.verticalLayout.addWidget(self.reset_button)

        self.dec_button = QPushButton(self.widget)
        self.dec_button.setObjectName(u"dec_button")
        sizePolicy.setHeightForWidth(self.dec_button.sizePolicy().hasHeightForWidth())
        self.dec_button.setSizePolicy(sizePolicy)
        self.dec_button.setFont(font1)

        self.verticalLayout.addWidget(self.dec_button)


        self.retranslateUi(Form)

        QMetaObject.connectSlotsByName(Form)
    # setupUi

    def retranslateUi(self, Form):
        Form.setWindowTitle(QCoreApplication.translate("Form", u"Form", None))
        self.num_label.setText(QCoreApplication.translate("Form", u"0", None))
        self.inc_button.setText(QCoreApplication.translate("Form", u"+", None))
        self.reset_button.setText(QCoreApplication.translate("Form", u"RESET", None))
        self.dec_button.setText(QCoreApplication.translate("Form", u"-", None))
    # retranslateUi

