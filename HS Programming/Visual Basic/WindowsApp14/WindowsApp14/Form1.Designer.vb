<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
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
        Me.informationgroupbox = New System.Windows.Forms.GroupBox()
        Me.stateComboBox = New System.Windows.Forms.ComboBox()
        Me.addressTextBox = New System.Windows.Forms.TextBox()
        Me.ZipTextBox = New System.Windows.Forms.TextBox()
        Me.cityTextBox = New System.Windows.Forms.TextBox()
        Me.arrivalTimeLabel = New System.Windows.Forms.TextBox()
        Me.packagenumberlabel = New System.Windows.Forms.TextBox()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.GroupBox2 = New System.Windows.Forms.GroupBox()
        Me.viewpackagesComboBox = New System.Windows.Forms.ComboBox()
        Me.packagesListBox = New System.Windows.Forms.ListBox()
        Me.nextButton = New System.Windows.Forms.Button()
        Me.backButton = New System.Windows.Forms.Button()
        Me.editUpdateButton = New System.Windows.Forms.Button()
        Me.removeButton = New System.Windows.Forms.Button()
        Me.addButton = New System.Windows.Forms.Button()
        Me.newButton = New System.Windows.Forms.Button()
        Me.informationgroupbox.SuspendLayout()
        Me.GroupBox2.SuspendLayout()
        Me.SuspendLayout()
        '
        'informationgroupbox
        '
        Me.informationgroupbox.Controls.Add(Me.stateComboBox)
        Me.informationgroupbox.Controls.Add(Me.addressTextBox)
        Me.informationgroupbox.Controls.Add(Me.ZipTextBox)
        Me.informationgroupbox.Controls.Add(Me.cityTextBox)
        Me.informationgroupbox.Controls.Add(Me.arrivalTimeLabel)
        Me.informationgroupbox.Controls.Add(Me.packagenumberlabel)
        Me.informationgroupbox.Controls.Add(Me.Label6)
        Me.informationgroupbox.Controls.Add(Me.Label5)
        Me.informationgroupbox.Controls.Add(Me.Label4)
        Me.informationgroupbox.Controls.Add(Me.Label3)
        Me.informationgroupbox.Controls.Add(Me.Label2)
        Me.informationgroupbox.Controls.Add(Me.Label1)
        Me.informationgroupbox.Location = New System.Drawing.Point(94, 48)
        Me.informationgroupbox.Name = "informationgroupbox"
        Me.informationgroupbox.Size = New System.Drawing.Size(462, 121)
        Me.informationgroupbox.TabIndex = 0
        Me.informationgroupbox.TabStop = False
        Me.informationgroupbox.Text = "PACKAGE INFORMATION"
        '
        'stateComboBox
        '
        Me.stateComboBox.FormattingEnabled = True
        Me.stateComboBox.Items.AddRange(New Object() {"AL", "FL", "GA", "KY", "MS", "NC", "SC", "TN", "VA", "WV"})
        Me.stateComboBox.Location = New System.Drawing.Point(220, 81)
        Me.stateComboBox.Name = "stateComboBox"
        Me.stateComboBox.Size = New System.Drawing.Size(95, 21)
        Me.stateComboBox.TabIndex = 1
        '
        'addressTextBox
        '
        Me.addressTextBox.Location = New System.Drawing.Point(75, 51)
        Me.addressTextBox.Name = "addressTextBox"
        Me.addressTextBox.Size = New System.Drawing.Size(369, 20)
        Me.addressTextBox.TabIndex = 1
        '
        'ZipTextBox
        '
        Me.ZipTextBox.Location = New System.Drawing.Point(354, 81)
        Me.ZipTextBox.Name = "ZipTextBox"
        Me.ZipTextBox.Size = New System.Drawing.Size(90, 20)
        Me.ZipTextBox.TabIndex = 1
        '
        'cityTextBox
        '
        Me.cityTextBox.Location = New System.Drawing.Point(54, 81)
        Me.cityTextBox.Name = "cityTextBox"
        Me.cityTextBox.Size = New System.Drawing.Size(119, 20)
        Me.cityTextBox.TabIndex = 1
        '
        'arrivalTimeLabel
        '
        Me.arrivalTimeLabel.Location = New System.Drawing.Point(300, 22)
        Me.arrivalTimeLabel.Name = "arrivalTimeLabel"
        Me.arrivalTimeLabel.Size = New System.Drawing.Size(144, 20)
        Me.arrivalTimeLabel.TabIndex = 1
        '
        'packagenumberlabel
        '
        Me.packagenumberlabel.Location = New System.Drawing.Point(94, 22)
        Me.packagenumberlabel.Name = "packagenumberlabel"
        Me.packagenumberlabel.Size = New System.Drawing.Size(129, 20)
        Me.packagenumberlabel.TabIndex = 1
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(321, 84)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(27, 13)
        Me.Label6.TabIndex = 1
        Me.Label6.Text = "ZIP:"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(179, 84)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(35, 13)
        Me.Label5.TabIndex = 1
        Me.Label5.Text = "State:"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(239, 25)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(55, 13)
        Me.Label4.TabIndex = 1
        Me.Label4.Text = "Arrived at:"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(21, 84)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(27, 13)
        Me.Label3.TabIndex = 1
        Me.Label3.Text = "City:"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(21, 54)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(48, 13)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "Address:"
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(21, 25)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(67, 13)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "Package ID:"
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.viewpackagesComboBox)
        Me.GroupBox2.Controls.Add(Me.packagesListBox)
        Me.GroupBox2.Location = New System.Drawing.Point(562, 48)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(181, 143)
        Me.GroupBox2.TabIndex = 0
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "PACKAGES BY DESTINATION"
        '
        'viewpackagesComboBox
        '
        Me.viewpackagesComboBox.FormattingEnabled = True
        Me.viewpackagesComboBox.Location = New System.Drawing.Point(30, 24)
        Me.viewpackagesComboBox.Name = "viewpackagesComboBox"
        Me.viewpackagesComboBox.Size = New System.Drawing.Size(120, 21)
        Me.viewpackagesComboBox.TabIndex = 1
        '
        'packagesListBox
        '
        Me.packagesListBox.FormattingEnabled = True
        Me.packagesListBox.Location = New System.Drawing.Point(30, 51)
        Me.packagesListBox.Name = "packagesListBox"
        Me.packagesListBox.Size = New System.Drawing.Size(120, 69)
        Me.packagesListBox.TabIndex = 0
        '
        'nextButton
        '
        Me.nextButton.Location = New System.Drawing.Point(481, 175)
        Me.nextButton.Name = "nextButton"
        Me.nextButton.Size = New System.Drawing.Size(75, 23)
        Me.nextButton.TabIndex = 1
        Me.nextButton.Text = "NEXT >>"
        Me.nextButton.UseVisualStyleBackColor = True
        '
        'backButton
        '
        Me.backButton.Location = New System.Drawing.Point(400, 175)
        Me.backButton.Name = "backButton"
        Me.backButton.Size = New System.Drawing.Size(75, 23)
        Me.backButton.TabIndex = 1
        Me.backButton.Text = "<< BACK"
        Me.backButton.UseVisualStyleBackColor = True
        '
        'editUpdateButton
        '
        Me.editUpdateButton.Location = New System.Drawing.Point(305, 175)
        Me.editUpdateButton.Name = "editUpdateButton"
        Me.editUpdateButton.RightToLeft = System.Windows.Forms.RightToLeft.Yes
        Me.editUpdateButton.Size = New System.Drawing.Size(65, 23)
        Me.editUpdateButton.TabIndex = 1
        Me.editUpdateButton.Text = "EDIT"
        Me.editUpdateButton.UseVisualStyleBackColor = True
        '
        'removeButton
        '
        Me.removeButton.Location = New System.Drawing.Point(234, 175)
        Me.removeButton.Name = "removeButton"
        Me.removeButton.Size = New System.Drawing.Size(65, 23)
        Me.removeButton.TabIndex = 1
        Me.removeButton.Text = "REMOVE"
        Me.removeButton.UseVisualStyleBackColor = True
        '
        'addButton
        '
        Me.addButton.Location = New System.Drawing.Point(164, 175)
        Me.addButton.Name = "addButton"
        Me.addButton.Size = New System.Drawing.Size(65, 23)
        Me.addButton.TabIndex = 1
        Me.addButton.Text = "ADD"
        Me.addButton.UseVisualStyleBackColor = True
        '
        'newButton
        '
        Me.newButton.Location = New System.Drawing.Point(94, 175)
        Me.newButton.Name = "newButton"
        Me.newButton.Size = New System.Drawing.Size(65, 23)
        Me.newButton.TabIndex = 1
        Me.newButton.Text = "SCAN NOW"
        Me.newButton.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(911, 450)
        Me.Controls.Add(Me.newButton)
        Me.Controls.Add(Me.addButton)
        Me.Controls.Add(Me.removeButton)
        Me.Controls.Add(Me.editUpdateButton)
        Me.Controls.Add(Me.backButton)
        Me.Controls.Add(Me.nextButton)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.informationgroupbox)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.informationgroupbox.ResumeLayout(False)
        Me.informationgroupbox.PerformLayout()
        Me.GroupBox2.ResumeLayout(False)
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents informationgroupbox As GroupBox
    Friend WithEvents stateComboBox As ComboBox
    Friend WithEvents addressTextBox As TextBox
    Friend WithEvents ZipTextBox As TextBox
    Friend WithEvents cityTextBox As TextBox
    Friend WithEvents arrivalTimeLabel As TextBox
    Friend WithEvents packagenumberlabel As TextBox
    Friend WithEvents Label6 As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label1 As Label
    Friend WithEvents GroupBox2 As GroupBox
    Friend WithEvents viewpackagesComboBox As ComboBox
    Friend WithEvents packagesListBox As ListBox
    Friend WithEvents nextButton As Button
    Friend WithEvents backButton As Button
    Friend WithEvents editUpdateButton As Button
    Friend WithEvents removeButton As Button
    Friend WithEvents addButton As Button
    Friend WithEvents newButton As Button
End Class
