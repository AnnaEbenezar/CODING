<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class DentalPaymentForm
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.nameTextBox = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.CheckBox1 = New System.Windows.Forms.CheckBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.cleancostlabel = New System.Windows.Forms.Label()
        Me.fillingcostlabel = New System.Windows.Forms.Label()
        Me.cavitycheckbox = New System.Windows.Forms.CheckBox()
        Me.xraycostlabel = New System.Windows.Forms.Label()
        Me.xraycheckbox = New System.Windows.Forms.CheckBox()
        Me.fluoridecostlabel = New System.Windows.Forms.Label()
        Me.fluoridecheckbox = New System.Windows.Forms.CheckBox()
        Me.rootcanalcostlabel = New System.Windows.Forms.Label()
        Me.rootcanalcheckbox = New System.Windows.Forms.CheckBox()
        Me.Label8 = New System.Windows.Forms.Label()
        Me.othercheckbox = New System.Windows.Forms.CheckBox()
        Me.cleancheckbox = New System.Windows.Forms.CheckBox()
        Me.otherTextBox = New System.Windows.Forms.TextBox()
        Me.totalresult = New System.Windows.Forms.TextBox()
        Me.Label9 = New System.Windows.Forms.Label()
        Me.calculatebutton = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'nameTextBox
        '
        Me.nameTextBox.Location = New System.Drawing.Point(374, 73)
        Me.nameTextBox.Name = "nameTextBox"
        Me.nameTextBox.Size = New System.Drawing.Size(100, 20)
        Me.nameTextBox.TabIndex = 0
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 15.0!)
        Me.Label1.Location = New System.Drawing.Point(218, 34)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(256, 25)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "DENTAL PAYMENT FORM"
        '
        'CheckBox1
        '
        Me.CheckBox1.AutoSize = True
        Me.CheckBox1.Location = New System.Drawing.Point(225, 133)
        Me.CheckBox1.Name = "CheckBox1"
        Me.CheckBox1.Size = New System.Drawing.Size(81, 17)
        Me.CheckBox1.TabIndex = 2
        Me.CheckBox1.Text = "CheckBox1"
        Me.CheckBox1.UseVisualStyleBackColor = True
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(222, 80)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(71, 13)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "Patient Name"
        '
        'cleancostlabel
        '
        Me.cleancostlabel.AutoSize = True
        Me.cleancostlabel.Location = New System.Drawing.Point(461, 129)
        Me.cleancostlabel.Name = "cleancostlabel"
        Me.cleancostlabel.Size = New System.Drawing.Size(19, 13)
        Me.cleancostlabel.TabIndex = 1
        Me.cleancostlabel.Text = "35"
        Me.cleancostlabel.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'fillingcostlabel
        '
        Me.fillingcostlabel.AutoSize = True
        Me.fillingcostlabel.Location = New System.Drawing.Point(455, 155)
        Me.fillingcostlabel.Name = "fillingcostlabel"
        Me.fillingcostlabel.Size = New System.Drawing.Size(25, 13)
        Me.fillingcostlabel.TabIndex = 1
        Me.fillingcostlabel.Text = "150"
        Me.fillingcostlabel.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'cavitycheckbox
        '
        Me.cavitycheckbox.AutoSize = True
        Me.cavitycheckbox.Location = New System.Drawing.Point(225, 155)
        Me.cavitycheckbox.Name = "cavitycheckbox"
        Me.cavitycheckbox.Size = New System.Drawing.Size(107, 17)
        Me.cavitycheckbox.TabIndex = 2
        Me.cavitycheckbox.Text = "CAVITY FILLING"
        Me.cavitycheckbox.UseVisualStyleBackColor = True
        '
        'xraycostlabel
        '
        Me.xraycostlabel.AutoSize = True
        Me.xraycostlabel.Location = New System.Drawing.Point(461, 181)
        Me.xraycostlabel.Name = "xraycostlabel"
        Me.xraycostlabel.Size = New System.Drawing.Size(19, 13)
        Me.xraycostlabel.TabIndex = 1
        Me.xraycostlabel.Text = "85"
        Me.xraycostlabel.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'xraycheckbox
        '
        Me.xraycheckbox.AutoSize = True
        Me.xraycheckbox.Location = New System.Drawing.Point(225, 181)
        Me.xraycheckbox.Name = "xraycheckbox"
        Me.xraycheckbox.Size = New System.Drawing.Size(58, 17)
        Me.xraycheckbox.TabIndex = 2
        Me.xraycheckbox.Text = "X-RAY"
        Me.xraycheckbox.UseVisualStyleBackColor = True
        '
        'fluoridecostlabel
        '
        Me.fluoridecostlabel.AutoSize = True
        Me.fluoridecostlabel.Location = New System.Drawing.Point(461, 209)
        Me.fluoridecostlabel.Name = "fluoridecostlabel"
        Me.fluoridecostlabel.Size = New System.Drawing.Size(19, 13)
        Me.fluoridecostlabel.TabIndex = 1
        Me.fluoridecostlabel.Text = "50"
        Me.fluoridecostlabel.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'fluoridecheckbox
        '
        Me.fluoridecheckbox.AutoSize = True
        Me.fluoridecheckbox.Location = New System.Drawing.Point(225, 209)
        Me.fluoridecheckbox.Name = "fluoridecheckbox"
        Me.fluoridecheckbox.Size = New System.Drawing.Size(80, 17)
        Me.fluoridecheckbox.TabIndex = 2
        Me.fluoridecheckbox.Text = "FLUORIDE"
        Me.fluoridecheckbox.UseVisualStyleBackColor = True
        '
        'rootcanalcostlabel
        '
        Me.rootcanalcostlabel.AutoSize = True
        Me.rootcanalcostlabel.Location = New System.Drawing.Point(455, 236)
        Me.rootcanalcostlabel.Name = "rootcanalcostlabel"
        Me.rootcanalcostlabel.Size = New System.Drawing.Size(25, 13)
        Me.rootcanalcostlabel.TabIndex = 1
        Me.rootcanalcostlabel.Text = "800"
        Me.rootcanalcostlabel.TextAlign = System.Drawing.ContentAlignment.MiddleRight
        '
        'rootcanalcheckbox
        '
        Me.rootcanalcheckbox.AutoSize = True
        Me.rootcanalcheckbox.Location = New System.Drawing.Point(225, 236)
        Me.rootcanalcheckbox.Name = "rootcanalcheckbox"
        Me.rootcanalcheckbox.Size = New System.Drawing.Size(95, 17)
        Me.rootcanalcheckbox.TabIndex = 2
        Me.rootcanalcheckbox.Text = "ROOT CANAL"
        Me.rootcanalcheckbox.UseVisualStyleBackColor = True
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(421, 261)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(13, 13)
        Me.Label8.TabIndex = 1
        Me.Label8.Text = "$"
        '
        'othercheckbox
        '
        Me.othercheckbox.AutoSize = True
        Me.othercheckbox.Location = New System.Drawing.Point(225, 261)
        Me.othercheckbox.Name = "othercheckbox"
        Me.othercheckbox.Size = New System.Drawing.Size(64, 17)
        Me.othercheckbox.TabIndex = 2
        Me.othercheckbox.Text = "OTHER"
        Me.othercheckbox.UseVisualStyleBackColor = True
        '
        'cleancheckbox
        '
        Me.cleancheckbox.AutoSize = True
        Me.cleancheckbox.Location = New System.Drawing.Point(225, 129)
        Me.cleancheckbox.Name = "cleancheckbox"
        Me.cleancheckbox.Size = New System.Drawing.Size(80, 17)
        Me.cleancheckbox.TabIndex = 2
        Me.cleancheckbox.Text = "CLEANING"
        Me.cleancheckbox.UseVisualStyleBackColor = True
        '
        'otherTextBox
        '
        Me.otherTextBox.Location = New System.Drawing.Point(440, 259)
        Me.otherTextBox.Name = "otherTextBox"
        Me.otherTextBox.Size = New System.Drawing.Size(34, 20)
        Me.otherTextBox.TabIndex = 0
        '
        'totalresult
        '
        Me.totalresult.Location = New System.Drawing.Point(402, 297)
        Me.totalresult.Name = "totalresult"
        Me.totalresult.Size = New System.Drawing.Size(72, 20)
        Me.totalresult.TabIndex = 0
        '
        'Label9
        '
        Me.Label9.AutoSize = True
        Me.Label9.Location = New System.Drawing.Point(362, 304)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(34, 13)
        Me.Label9.TabIndex = 1
        Me.Label9.Text = "Total:"
        '
        'calculatebutton
        '
        Me.calculatebutton.Location = New System.Drawing.Point(393, 342)
        Me.calculatebutton.Name = "calculatebutton"
        Me.calculatebutton.Size = New System.Drawing.Size(81, 23)
        Me.calculatebutton.TabIndex = 3
        Me.calculatebutton.Text = "CALCULATE"
        Me.calculatebutton.UseVisualStyleBackColor = True
        '
        'DentalPaymentForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(537, 450)
        Me.Controls.Add(Me.calculatebutton)
        Me.Controls.Add(Me.othercheckbox)
        Me.Controls.Add(Me.rootcanalcheckbox)
        Me.Controls.Add(Me.fluoridecheckbox)
        Me.Controls.Add(Me.xraycheckbox)
        Me.Controls.Add(Me.cavitycheckbox)
        Me.Controls.Add(Me.cleancheckbox)
        Me.Controls.Add(Me.CheckBox1)
        Me.Controls.Add(Me.Label8)
        Me.Controls.Add(Me.rootcanalcostlabel)
        Me.Controls.Add(Me.fluoridecostlabel)
        Me.Controls.Add(Me.xraycostlabel)
        Me.Controls.Add(Me.fillingcostlabel)
        Me.Controls.Add(Me.cleancostlabel)
        Me.Controls.Add(Me.Label9)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.otherTextBox)
        Me.Controls.Add(Me.totalresult)
        Me.Controls.Add(Me.nameTextBox)
        Me.Name = "DentalPaymentForm"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents nameTextBox As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents CheckBox1 As CheckBox
    Friend WithEvents Label2 As Label
    Friend WithEvents cleancostlabel As Label
    Friend WithEvents fillingcostlabel As Label
    Friend WithEvents cavitycheckbox As CheckBox
    Friend WithEvents xraycostlabel As Label
    Friend WithEvents xraycheckbox As CheckBox
    Friend WithEvents fluoridecostlabel As Label
    Friend WithEvents fluoridecheckbox As CheckBox
    Friend WithEvents rootcanalcostlabel As Label
    Friend WithEvents rootcanalcheckbox As CheckBox
    Friend WithEvents Label8 As Label
    Friend WithEvents othercheckbox As CheckBox
    Friend WithEvents cleancheckbox As CheckBox
    Friend WithEvents otherTextBox As TextBox
    Friend WithEvents totalresult As TextBox
    Friend WithEvents Label9 As Label
    Friend WithEvents calculatebutton As Button
End Class
