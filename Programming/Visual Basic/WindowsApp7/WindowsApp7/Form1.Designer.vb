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
        Me.resultlabel = New System.Windows.Forms.TextBox()
        Me.ItemsComboBox = New System.Windows.Forms.ComboBox()
        Me.SearchButton = New System.Windows.Forms.Button()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.htmlLabel = New System.Windows.Forms.TextBox()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(455, 66)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(38, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "BORN"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(455, 115)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(39, 13)
        Me.Label2.TabIndex = 0
        Me.Label2.Text = "PRICE"
        '
        'resultlabel
        '
        Me.resultlabel.Location = New System.Drawing.Point(540, 107)
        Me.resultlabel.Name = "resultlabel"
        Me.resultlabel.Size = New System.Drawing.Size(120, 20)
        Me.resultlabel.TabIndex = 1
        '
        'ItemsComboBox
        '
        Me.ItemsComboBox.FormattingEnabled = True
        Me.ItemsComboBox.Items.AddRange(New Object() {"Antique Rocking Chair", "Silver Teapot", "Gold Pocket Watch"})
        Me.ItemsComboBox.Location = New System.Drawing.Point(540, 57)
        Me.ItemsComboBox.Name = "ItemsComboBox"
        Me.ItemsComboBox.Size = New System.Drawing.Size(121, 21)
        Me.ItemsComboBox.TabIndex = 2
        '
        'SearchButton
        '
        Me.SearchButton.Location = New System.Drawing.Point(585, 149)
        Me.SearchButton.Name = "SearchButton"
        Me.SearchButton.Size = New System.Drawing.Size(75, 23)
        Me.SearchButton.TabIndex = 3
        Me.SearchButton.Text = "Button1"
        Me.SearchButton.UseVisualStyleBackColor = True
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(455, 185)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(52, 13)
        Me.Label3.TabIndex = 0
        Me.Label3.Text = "SOURCE"
        '
        'htmlLabel
        '
        Me.htmlLabel.Location = New System.Drawing.Point(458, 217)
        Me.htmlLabel.Multiline = True
        Me.htmlLabel.Name = "htmlLabel"
        Me.htmlLabel.Size = New System.Drawing.Size(202, 160)
        Me.htmlLabel.TabIndex = 1
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.SearchButton)
        Me.Controls.Add(Me.ItemsComboBox)
        Me.Controls.Add(Me.htmlLabel)
        Me.Controls.Add(Me.resultlabel)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents resultlabel As TextBox
    Friend WithEvents ItemsComboBox As ComboBox
    Friend WithEvents SearchButton As Button
    Friend WithEvents Label3 As Label
    Friend WithEvents htmlLabel As TextBox
End Class
