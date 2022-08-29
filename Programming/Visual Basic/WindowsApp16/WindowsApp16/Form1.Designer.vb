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
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.quantityTextBox = New System.Windows.Forms.TextBox()
        Me.itemTextBox = New System.Windows.Forms.TextBox()
        Me.priceTextBox = New System.Windows.Forms.TextBox()
        Me.addButton = New System.Windows.Forms.Button()
        Me.totalButton = New System.Windows.Forms.Button()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.quantityListBox = New System.Windows.Forms.ListBox()
        Me.itemListBox = New System.Windows.Forms.ListBox()
        Me.priceListBox = New System.Windows.Forms.ListBox()
        Me.Label7 = New System.Windows.Forms.Label()
        Me.resultLabel = New System.Windows.Forms.TextBox()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(171, 70)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(49, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Quantity:"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(171, 96)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(60, 13)
        Me.Label2.TabIndex = 0
        Me.Label2.Text = "Menu Item:"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(171, 122)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(34, 13)
        Me.Label3.TabIndex = 0
        Me.Label3.Text = "Price:"
        '
        'quantityTextBox
        '
        Me.quantityTextBox.Location = New System.Drawing.Point(234, 67)
        Me.quantityTextBox.Name = "quantityTextBox"
        Me.quantityTextBox.Size = New System.Drawing.Size(100, 20)
        Me.quantityTextBox.TabIndex = 1
        '
        'itemTextBox
        '
        Me.itemTextBox.Location = New System.Drawing.Point(234, 93)
        Me.itemTextBox.Name = "itemTextBox"
        Me.itemTextBox.Size = New System.Drawing.Size(100, 20)
        Me.itemTextBox.TabIndex = 1
        '
        'priceTextBox
        '
        Me.priceTextBox.Location = New System.Drawing.Point(234, 119)
        Me.priceTextBox.Name = "priceTextBox"
        Me.priceTextBox.Size = New System.Drawing.Size(100, 20)
        Me.priceTextBox.TabIndex = 1
        '
        'addButton
        '
        Me.addButton.Location = New System.Drawing.Point(366, 70)
        Me.addButton.Name = "addButton"
        Me.addButton.Size = New System.Drawing.Size(75, 23)
        Me.addButton.TabIndex = 2
        Me.addButton.Text = "Add Item"
        Me.addButton.UseVisualStyleBackColor = True
        '
        'totalButton
        '
        Me.totalButton.Location = New System.Drawing.Point(366, 99)
        Me.totalButton.Name = "totalButton"
        Me.totalButton.Size = New System.Drawing.Size(75, 23)
        Me.totalButton.TabIndex = 2
        Me.totalButton.Text = "Total Bill"
        Me.totalButton.UseVisualStyleBackColor = True
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(195, 171)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(49, 13)
        Me.Label4.TabIndex = 0
        Me.Label4.Text = "Quantity:"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(268, 171)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(60, 13)
        Me.Label5.TabIndex = 0
        Me.Label5.Text = "Menu Item:"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(362, 171)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(34, 13)
        Me.Label6.TabIndex = 0
        Me.Label6.Text = "Price:"
        '
        'quantityListBox
        '
        Me.quantityListBox.FormattingEnabled = True
        Me.quantityListBox.Location = New System.Drawing.Point(180, 187)
        Me.quantityListBox.Name = "quantityListBox"
        Me.quantityListBox.Size = New System.Drawing.Size(76, 95)
        Me.quantityListBox.TabIndex = 3
        '
        'itemListBox
        '
        Me.itemListBox.FormattingEnabled = True
        Me.itemListBox.Location = New System.Drawing.Point(262, 187)
        Me.itemListBox.Name = "itemListBox"
        Me.itemListBox.Size = New System.Drawing.Size(76, 95)
        Me.itemListBox.TabIndex = 3
        '
        'priceListBox
        '
        Me.priceListBox.FormattingEnabled = True
        Me.priceListBox.Location = New System.Drawing.Point(344, 187)
        Me.priceListBox.Name = "priceListBox"
        Me.priceListBox.Size = New System.Drawing.Size(76, 95)
        Me.priceListBox.TabIndex = 3
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(278, 313)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(58, 13)
        Me.Label7.TabIndex = 0
        Me.Label7.Text = "Total Cost:"
        '
        'resultLabel
        '
        Me.resultLabel.Location = New System.Drawing.Point(341, 310)
        Me.resultLabel.Name = "resultLabel"
        Me.resultLabel.Size = New System.Drawing.Size(100, 20)
        Me.resultLabel.TabIndex = 1
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.priceListBox)
        Me.Controls.Add(Me.itemListBox)
        Me.Controls.Add(Me.quantityListBox)
        Me.Controls.Add(Me.totalButton)
        Me.Controls.Add(Me.addButton)
        Me.Controls.Add(Me.resultLabel)
        Me.Controls.Add(Me.priceTextBox)
        Me.Controls.Add(Me.itemTextBox)
        Me.Controls.Add(Me.quantityTextBox)
        Me.Controls.Add(Me.Label7)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents quantityTextBox As TextBox
    Friend WithEvents itemTextBox As TextBox
    Friend WithEvents priceTextBox As TextBox
    Friend WithEvents addButton As Button
    Friend WithEvents totalButton As Button
    Friend WithEvents Label4 As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents Label6 As Label
    Friend WithEvents quantityListBox As ListBox
    Friend WithEvents itemListBox As ListBox
    Friend WithEvents priceListBox As ListBox
    Friend WithEvents Label7 As Label
    Friend WithEvents resultLabel As TextBox
End Class
