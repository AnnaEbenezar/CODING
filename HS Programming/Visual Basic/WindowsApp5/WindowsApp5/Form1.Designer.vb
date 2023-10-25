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
        Me.PriceTextBox = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.downpaymenttextbox = New System.Windows.Forms.TextBox()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.interestTextBox1 = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.PaymentListBox = New System.Windows.Forms.ListBox()
        Me.calculatebutton = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'PriceTextBox
        '
        Me.PriceTextBox.Location = New System.Drawing.Point(485, 93)
        Me.PriceTextBox.Name = "PriceTextBox"
        Me.PriceTextBox.Size = New System.Drawing.Size(100, 20)
        Me.PriceTextBox.TabIndex = 0
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(304, 100)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(39, 13)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "PRICE"
        '
        'downpaymenttextbox
        '
        Me.downpaymenttextbox.Location = New System.Drawing.Point(485, 157)
        Me.downpaymenttextbox.Name = "downpaymenttextbox"
        Me.downpaymenttextbox.Size = New System.Drawing.Size(100, 20)
        Me.downpaymenttextbox.TabIndex = 0
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(304, 164)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(97, 13)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "DOWN PAYMENT"
        '
        'interestTextBox1
        '
        Me.interestTextBox1.Location = New System.Drawing.Point(485, 222)
        Me.interestTextBox1.Name = "interestTextBox1"
        Me.interestTextBox1.Size = New System.Drawing.Size(100, 20)
        Me.interestTextBox1.TabIndex = 0
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(304, 229)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(140, 13)
        Me.Label3.TabIndex = 1
        Me.Label3.Text = "ANNUAL INTEREST RATE"
        '
        'PaymentListBox
        '
        Me.PaymentListBox.FormattingEnabled = True
        Me.PaymentListBox.Location = New System.Drawing.Point(307, 271)
        Me.PaymentListBox.Name = "PaymentListBox"
        Me.PaymentListBox.Size = New System.Drawing.Size(278, 121)
        Me.PaymentListBox.TabIndex = 2
        '
        'calculatebutton
        '
        Me.calculatebutton.Location = New System.Drawing.Point(714, 211)
        Me.calculatebutton.Name = "calculatebutton"
        Me.calculatebutton.Size = New System.Drawing.Size(75, 23)
        Me.calculatebutton.TabIndex = 3
        Me.calculatebutton.Text = "Button1"
        Me.calculatebutton.UseVisualStyleBackColor = True
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(912, 449)
        Me.Controls.Add(Me.calculatebutton)
        Me.Controls.Add(Me.PaymentListBox)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.interestTextBox1)
        Me.Controls.Add(Me.downpaymenttextbox)
        Me.Controls.Add(Me.PriceTextBox)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents PriceTextBox As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents downpaymenttextbox As TextBox
    Friend WithEvents Label2 As Label
    Friend WithEvents interestTextBox1 As TextBox
    Friend WithEvents Label3 As Label
    Friend WithEvents PaymentListBox As ListBox
    Friend WithEvents calculatebutton As Button
End Class
