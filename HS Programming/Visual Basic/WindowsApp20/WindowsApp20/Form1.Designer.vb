<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class StudentGradesForm
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
        Me.inputGroupBox = New System.Windows.Forms.GroupBox()
        Me.submitButton = New System.Windows.Forms.Button()
        Me.test3TextBox = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.test2TextBox = New System.Windows.Forms.TextBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.test1TextBox = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.gradesListBox = New System.Windows.Forms.ListBox()
        Me.numericRadioButton = New System.Windows.Forms.RadioButton()
        Me.GroupBox2 = New System.Windows.Forms.GroupBox()
        Me.letterRadioButton = New System.Windows.Forms.RadioButton()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.averageLabel = New System.Windows.Forms.TextBox()
        Me.inputGroupBox.SuspendLayout()
        Me.GroupBox2.SuspendLayout()
        Me.SuspendLayout()
        '
        'inputGroupBox
        '
        Me.inputGroupBox.Controls.Add(Me.submitButton)
        Me.inputGroupBox.Controls.Add(Me.test3TextBox)
        Me.inputGroupBox.Controls.Add(Me.Label3)
        Me.inputGroupBox.Controls.Add(Me.test2TextBox)
        Me.inputGroupBox.Controls.Add(Me.Label2)
        Me.inputGroupBox.Controls.Add(Me.test1TextBox)
        Me.inputGroupBox.Controls.Add(Me.Label1)
        Me.inputGroupBox.Location = New System.Drawing.Point(221, 122)
        Me.inputGroupBox.Name = "inputGroupBox"
        Me.inputGroupBox.Size = New System.Drawing.Size(195, 128)
        Me.inputGroupBox.TabIndex = 0
        Me.inputGroupBox.TabStop = False
        Me.inputGroupBox.Text = "INPUT GRADES"
        '
        'submitButton
        '
        Me.submitButton.Location = New System.Drawing.Point(75, 99)
        Me.submitButton.Name = "submitButton"
        Me.submitButton.Size = New System.Drawing.Size(114, 23)
        Me.submitButton.TabIndex = 5
        Me.submitButton.Text = "SUBMIT GRADES"
        Me.submitButton.UseVisualStyleBackColor = True
        '
        'test3TextBox
        '
        Me.test3TextBox.Location = New System.Drawing.Point(56, 73)
        Me.test3TextBox.Name = "test3TextBox"
        Me.test3TextBox.Size = New System.Drawing.Size(100, 20)
        Me.test3TextBox.TabIndex = 2
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(6, 76)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(44, 13)
        Me.Label3.TabIndex = 1
        Me.Label3.Text = "TEST 3"
        '
        'test2TextBox
        '
        Me.test2TextBox.Location = New System.Drawing.Point(56, 47)
        Me.test2TextBox.Name = "test2TextBox"
        Me.test2TextBox.Size = New System.Drawing.Size(100, 20)
        Me.test2TextBox.TabIndex = 2
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(6, 50)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(44, 13)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "TEST 2"
        '
        'test1TextBox
        '
        Me.test1TextBox.Location = New System.Drawing.Point(56, 21)
        Me.test1TextBox.Name = "test1TextBox"
        Me.test1TextBox.Size = New System.Drawing.Size(100, 20)
        Me.test1TextBox.TabIndex = 2
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(6, 24)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(44, 13)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "TEST 1"
        '
        'gradesListBox
        '
        Me.gradesListBox.FormattingEnabled = True
        Me.gradesListBox.Items.AddRange(New Object() {"" & Global.Microsoft.VisualBasic.ChrW(9) & Global.Microsoft.VisualBasic.ChrW(9) & "TEST 1" & Global.Microsoft.VisualBasic.ChrW(9) & "TEST 2" & Global.Microsoft.VisualBasic.ChrW(9) & "TEST 3" & Global.Microsoft.VisualBasic.ChrW(9) & "AVERAGE "})
        Me.gradesListBox.Location = New System.Drawing.Point(422, 122)
        Me.gradesListBox.Name = "gradesListBox"
        Me.gradesListBox.Size = New System.Drawing.Size(302, 134)
        Me.gradesListBox.TabIndex = 3
        '
        'numericRadioButton
        '
        Me.numericRadioButton.AutoSize = True
        Me.numericRadioButton.Location = New System.Drawing.Point(20, 19)
        Me.numericRadioButton.Name = "numericRadioButton"
        Me.numericRadioButton.Size = New System.Drawing.Size(75, 17)
        Me.numericRadioButton.TabIndex = 4
        Me.numericRadioButton.TabStop = True
        Me.numericRadioButton.Text = "NUMERIC"
        Me.numericRadioButton.UseVisualStyleBackColor = True
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.letterRadioButton)
        Me.GroupBox2.Controls.Add(Me.numericRadioButton)
        Me.GroupBox2.Location = New System.Drawing.Point(221, 256)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(195, 50)
        Me.GroupBox2.TabIndex = 0
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "GroupBox1"
        '
        'letterRadioButton
        '
        Me.letterRadioButton.AutoSize = True
        Me.letterRadioButton.Location = New System.Drawing.Point(111, 19)
        Me.letterRadioButton.Name = "letterRadioButton"
        Me.letterRadioButton.Size = New System.Drawing.Size(67, 17)
        Me.letterRadioButton.TabIndex = 4
        Me.letterRadioButton.TabStop = True
        Me.letterRadioButton.Text = "LETTER"
        Me.letterRadioButton.UseVisualStyleBackColor = True
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(548, 291)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(98, 13)
        Me.Label4.TabIndex = 1
        Me.Label4.Text = "CLASS AVERAGE:"
        '
        'averageLabel
        '
        Me.averageLabel.Location = New System.Drawing.Point(652, 286)
        Me.averageLabel.Name = "averageLabel"
        Me.averageLabel.Size = New System.Drawing.Size(72, 20)
        Me.averageLabel.TabIndex = 2
        '
        'StudentGradesForm
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.gradesListBox)
        Me.Controls.Add(Me.averageLabel)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.inputGroupBox)
        Me.Name = "StudentGradesForm"
        Me.Text = "Form1"
        Me.inputGroupBox.ResumeLayout(False)
        Me.inputGroupBox.PerformLayout()
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox2.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents inputGroupBox As GroupBox
    Friend WithEvents submitButton As Button
    Friend WithEvents test3TextBox As TextBox
    Friend WithEvents Label3 As Label
    Friend WithEvents test2TextBox As TextBox
    Friend WithEvents Label2 As Label
    Friend WithEvents test1TextBox As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents gradesListBox As ListBox
    Friend WithEvents numericRadioButton As RadioButton
    Friend WithEvents GroupBox2 As GroupBox
    Friend WithEvents letterRadioButton As RadioButton
    Friend WithEvents Label4 As Label
    Friend WithEvents averageLabel As TextBox
End Class
