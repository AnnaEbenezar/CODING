# -*- coding: utf-8 -*-

################################################################################
## Form generated from reading UI file 'Lab3_3_UI.ui'
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
from PySide6.QtWidgets import (QApplication, QGridLayout, QHBoxLayout, QLineEdit,
    QPushButton, QSizePolicy, QWidget)

class Ui_Form(object):
    def setupUi(self, Form):
        if not Form.objectName():
            Form.setObjectName(u"Form")
        Form.resize(400, 500)
        self.lineEdit = QLineEdit(Form)
        self.lineEdit.setObjectName(u"lineEdit")
        self.lineEdit.setGeometry(QRect(10, 10, 381, 41))
        font = QFont()
        font.setPointSize(25)
        self.lineEdit.setFont(font)
        self.lineEdit.setReadOnly(True)
        self.gridLayoutWidget = QWidget(Form)
        self.gridLayoutWidget.setObjectName(u"gridLayoutWidget")
        self.gridLayoutWidget.setGeometry(QRect(10, 60, 381, 351))
        sizePolicy = QSizePolicy(QSizePolicy.Preferred, QSizePolicy.Preferred)
        sizePolicy.setHorizontalStretch(0)
        sizePolicy.setVerticalStretch(0)
        sizePolicy.setHeightForWidth(self.gridLayoutWidget.sizePolicy().hasHeightForWidth())
        self.gridLayoutWidget.setSizePolicy(sizePolicy)
        self.gridLayout = QGridLayout(self.gridLayoutWidget)
        self.gridLayout.setObjectName(u"gridLayout")
        self.gridLayout.setContentsMargins(0, 0, 0, 0)
        self.pushButton_6 = QPushButton(self.gridLayoutWidget)
        self.pushButton_6.setObjectName(u"pushButton_6")
        sizePolicy1 = QSizePolicy(QSizePolicy.Minimum, QSizePolicy.Preferred)
        sizePolicy1.setHorizontalStretch(0)
        sizePolicy1.setVerticalStretch(0)
        sizePolicy1.setHeightForWidth(self.pushButton_6.sizePolicy().hasHeightForWidth())
        self.pushButton_6.setSizePolicy(sizePolicy1)
        font1 = QFont()
        font1.setPointSize(36)
        self.pushButton_6.setFont(font1)

        self.gridLayout.addWidget(self.pushButton_6, 4, 4, 1, 1)

        self.pushButton_4 = QPushButton(self.gridLayoutWidget)
        self.pushButton_4.setObjectName(u"pushButton_4")
        sizePolicy1.setHeightForWidth(self.pushButton_4.sizePolicy().hasHeightForWidth())
        self.pushButton_4.setSizePolicy(sizePolicy1)
        self.pushButton_4.setFont(font1)

        self.gridLayout.addWidget(self.pushButton_4, 4, 2, 1, 1)

        self.pushButton_8 = QPushButton(self.gridLayoutWidget)
        self.pushButton_8.setObjectName(u"pushButton_8")
        sizePolicy1.setHeightForWidth(self.pushButton_8.sizePolicy().hasHeightForWidth())
        self.pushButton_8.setSizePolicy(sizePolicy1)
        self.pushButton_8.setFont(font1)

        self.gridLayout.addWidget(self.pushButton_8, 5, 3, 1, 1)

        self.pushButton_3 = QPushButton(self.gridLayoutWidget)
        self.pushButton_3.setObjectName(u"pushButton_3")
        sizePolicy1.setHeightForWidth(self.pushButton_3.sizePolicy().hasHeightForWidth())
        self.pushButton_3.setSizePolicy(sizePolicy1)
        self.pushButton_3.setFont(font1)

        self.gridLayout.addWidget(self.pushButton_3, 3, 4, 1, 1)

        self.pushButton_5 = QPushButton(self.gridLayoutWidget)
        self.pushButton_5.setObjectName(u"pushButton_5")
        sizePolicy1.setHeightForWidth(self.pushButton_5.sizePolicy().hasHeightForWidth())
        self.pushButton_5.setSizePolicy(sizePolicy1)
        self.pushButton_5.setFont(font1)

        self.gridLayout.addWidget(self.pushButton_5, 4, 3, 1, 1)

        self.pushButton_9 = QPushButton(self.gridLayoutWidget)
        self.pushButton_9.setObjectName(u"pushButton_9")
        sizePolicy1.setHeightForWidth(self.pushButton_9.sizePolicy().hasHeightForWidth())
        self.pushButton_9.setSizePolicy(sizePolicy1)
        self.pushButton_9.setFont(font1)

        self.gridLayout.addWidget(self.pushButton_9, 5, 4, 1, 1)

        self.pushButton_1 = QPushButton(self.gridLayoutWidget)
        self.pushButton_1.setObjectName(u"pushButton_1")
        sizePolicy1.setHeightForWidth(self.pushButton_1.sizePolicy().hasHeightForWidth())
        self.pushButton_1.setSizePolicy(sizePolicy1)
        self.pushButton_1.setFont(font1)

        self.gridLayout.addWidget(self.pushButton_1, 3, 2, 1, 1)

        self.pushButton_7 = QPushButton(self.gridLayoutWidget)
        self.pushButton_7.setObjectName(u"pushButton_7")
        sizePolicy1.setHeightForWidth(self.pushButton_7.sizePolicy().hasHeightForWidth())
        self.pushButton_7.setSizePolicy(sizePolicy1)
        self.pushButton_7.setFont(font1)

        self.gridLayout.addWidget(self.pushButton_7, 5, 2, 1, 1)

        self.pushButton_2 = QPushButton(self.gridLayoutWidget)
        self.pushButton_2.setObjectName(u"pushButton_2")
        sizePolicy1.setHeightForWidth(self.pushButton_2.sizePolicy().hasHeightForWidth())
        self.pushButton_2.setSizePolicy(sizePolicy1)
        self.pushButton_2.setFont(font1)

        self.gridLayout.addWidget(self.pushButton_2, 3, 3, 1, 1)

        self.pushButton_star = QPushButton(self.gridLayoutWidget)
        self.pushButton_star.setObjectName(u"pushButton_star")
        sizePolicy1.setHeightForWidth(self.pushButton_star.sizePolicy().hasHeightForWidth())
        self.pushButton_star.setSizePolicy(sizePolicy1)
        self.pushButton_star.setFont(font1)

        self.gridLayout.addWidget(self.pushButton_star, 6, 2, 1, 1)

        self.pushButton_0 = QPushButton(self.gridLayoutWidget)
        self.pushButton_0.setObjectName(u"pushButton_0")
        sizePolicy1.setHeightForWidth(self.pushButton_0.sizePolicy().hasHeightForWidth())
        self.pushButton_0.setSizePolicy(sizePolicy1)
        self.pushButton_0.setFont(font1)

        self.gridLayout.addWidget(self.pushButton_0, 6, 3, 1, 1)

        self.pushButton_hash = QPushButton(self.gridLayoutWidget)
        self.pushButton_hash.setObjectName(u"pushButton_hash")
        sizePolicy1.setHeightForWidth(self.pushButton_hash.sizePolicy().hasHeightForWidth())
        self.pushButton_hash.setSizePolicy(sizePolicy1)
        self.pushButton_hash.setFont(font1)

        self.gridLayout.addWidget(self.pushButton_hash, 6, 4, 1, 1)

        self.horizontalLayoutWidget = QWidget(Form)
        self.horizontalLayoutWidget.setObjectName(u"horizontalLayoutWidget")
        self.horizontalLayoutWidget.setGeometry(QRect(10, 420, 381, 74))
        self.horizontalLayout = QHBoxLayout(self.horizontalLayoutWidget)
        self.horizontalLayout.setObjectName(u"horizontalLayout")
        self.horizontalLayout.setContentsMargins(0, 0, 0, 0)
        self.pushButton_Talk = QPushButton(self.horizontalLayoutWidget)
        self.pushButton_Talk.setObjectName(u"pushButton_Talk")
        sizePolicy1.setHeightForWidth(self.pushButton_Talk.sizePolicy().hasHeightForWidth())
        self.pushButton_Talk.setSizePolicy(sizePolicy1)
        self.pushButton_Talk.setFont(font1)

        self.horizontalLayout.addWidget(self.pushButton_Talk)

        self.pushButton_back = QPushButton(self.horizontalLayoutWidget)
        self.pushButton_back.setObjectName(u"pushButton_back")
        sizePolicy1.setHeightForWidth(self.pushButton_back.sizePolicy().hasHeightForWidth())
        self.pushButton_back.setSizePolicy(sizePolicy1)
        self.pushButton_back.setFont(font1)

        self.horizontalLayout.addWidget(self.pushButton_back)


        self.retranslateUi(Form)

        QMetaObject.connectSlotsByName(Form)
    # setupUi

    def retranslateUi(self, Form):
        Form.setWindowTitle(QCoreApplication.translate("Form", u"Form", None))
        self.pushButton_6.setText(QCoreApplication.translate("Form", u"6", None))
        self.pushButton_4.setText(QCoreApplication.translate("Form", u"4", None))
        self.pushButton_8.setText(QCoreApplication.translate("Form", u"8", None))
        self.pushButton_3.setText(QCoreApplication.translate("Form", u"3", None))
        self.pushButton_5.setText(QCoreApplication.translate("Form", u"5", None))
        self.pushButton_9.setText(QCoreApplication.translate("Form", u"9", None))
        self.pushButton_1.setText(QCoreApplication.translate("Form", u"1", None))
        self.pushButton_7.setText(QCoreApplication.translate("Form", u"7", None))
        self.pushButton_2.setText(QCoreApplication.translate("Form", u"2", None))
        self.pushButton_star.setText(QCoreApplication.translate("Form", u"*", None))
        self.pushButton_0.setText(QCoreApplication.translate("Form", u"0", None))
        self.pushButton_hash.setText(QCoreApplication.translate("Form", u"#", None))
        self.pushButton_Talk.setText(QCoreApplication.translate("Form", u"TALK", None))
        self.pushButton_back.setText(QCoreApplication.translate("Form", u"<", None))
    # retranslateUi

