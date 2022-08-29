<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form2
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
        Me.txtAvg3 = New System.Windows.Forms.TextBox()
        Me.txtAvg2 = New System.Windows.Forms.TextBox()
        Me.txtTot3 = New System.Windows.Forms.TextBox()
        Me.txtTot2 = New System.Windows.Forms.TextBox()
        Me.txtAvg1 = New System.Windows.Forms.TextBox()
        Me.txtTot1 = New System.Windows.Forms.TextBox()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.txtMaxV = New System.Windows.Forms.TextBox()
        Me.btnExit = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'txtAvg3
        '
        Me.txtAvg3.Location = New System.Drawing.Point(545, 182)
        Me.txtAvg3.Name = "txtAvg3"
        Me.txtAvg3.Size = New System.Drawing.Size(100, 20)
        Me.txtAvg3.TabIndex = 7
        '
        'txtAvg2
        '
        Me.txtAvg2.Location = New System.Drawing.Point(388, 182)
        Me.txtAvg2.Name = "txtAvg2"
        Me.txtAvg2.Size = New System.Drawing.Size(100, 20)
        Me.txtAvg2.TabIndex = 8
        '
        'txtTot3
        '
        Me.txtTot3.Location = New System.Drawing.Point(545, 123)
        Me.txtTot3.Name = "txtTot3"
        Me.txtTot3.Size = New System.Drawing.Size(100, 20)
        Me.txtTot3.TabIndex = 9
        '
        'txtTot2
        '
        Me.txtTot2.Location = New System.Drawing.Point(388, 123)
        Me.txtTot2.Name = "txtTot2"
        Me.txtTot2.Size = New System.Drawing.Size(100, 20)
        Me.txtTot2.TabIndex = 10
        '
        'txtAvg1
        '
        Me.txtAvg1.Location = New System.Drawing.Point(235, 182)
        Me.txtAvg1.Name = "txtAvg1"
        Me.txtAvg1.Size = New System.Drawing.Size(100, 20)
        Me.txtAvg1.TabIndex = 11
        '
        'txtTot1
        '
        Me.txtTot1.Location = New System.Drawing.Point(235, 123)
        Me.txtTot1.Name = "txtTot1"
        Me.txtTot1.Size = New System.Drawing.Size(100, 20)
        Me.txtTot1.TabIndex = 12
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(563, 86)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(68, 13)
        Me.Label6.TabIndex = 2
        Me.Label6.Text = "STUDENT 3"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(403, 86)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(68, 13)
        Me.Label5.TabIndex = 3
        Me.Label5.Text = "STUDENT 2"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(250, 86)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(68, 13)
        Me.Label4.TabIndex = 4
        Me.Label4.Text = "STUDENT 1"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(134, 189)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(58, 13)
        Me.Label2.TabIndex = 5
        Me.Label2.Text = "AVERAGE"
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(134, 130)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(42, 13)
        Me.Label1.TabIndex = 6
        Me.Label1.Text = "TOTAL"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(181, 254)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(68, 13)
        Me.Label3.TabIndex = 5
        Me.Label3.Text = "MAX VALUE"
        '
        'txtMaxV
        '
        Me.txtMaxV.Location = New System.Drawing.Point(282, 247)
        Me.txtMaxV.Name = "txtMaxV"
        Me.txtMaxV.Size = New System.Drawing.Size(100, 20)
        Me.txtMaxV.TabIndex = 11
        '
        'btnExit
        '
        Me.btnExit.Location = New System.Drawing.Point(465, 280)
        Me.btnExit.Name = "btnExit"
        Me.btnExit.Size = New System.Drawing.Size(75, 23)
        Me.btnExit.TabIndex = 13
        Me.btnExit.Text = "EXIT"
        Me.btnExit.UseVisualStyleBackColor = True
        '
        'Form2
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.btnExit)
        Me.Controls.Add(Me.txtAvg3)
        Me.Controls.Add(Me.txtAvg2)
        Me.Controls.Add(Me.txtTot3)
        Me.Controls.Add(Me.txtTot2)
        Me.Controls.Add(Me.txtMaxV)
        Me.Controls.Add(Me.txtAvg1)
        Me.Controls.Add(Me.txtTot1)
        Me.Controls.Add(Me.Label6)
        Me.Controls.Add(Me.Label5)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Name = "Form2"
        Me.Text = "Form2"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents txtAvg3 As TextBox
    Friend WithEvents txtAvg2 As TextBox
    Friend WithEvents txtTot3 As TextBox
    Friend WithEvents txtTot2 As TextBox
    Friend WithEvents txtAvg1 As TextBox
    Friend WithEvents txtTot1 As TextBox
    Friend WithEvents Label6 As Label
    Friend WithEvents Label5 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label1 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents txtMaxV As TextBox
    Friend WithEvents btnExit As Button
End Class
