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
        Me.GB1 = New System.Windows.Forms.GroupBox()
        Me.CALCbtn = New System.Windows.Forms.Button()
        Me.txtTEST3 = New System.Windows.Forms.TextBox()
        Me.txtTEST2 = New System.Windows.Forms.TextBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.txtTEST1 = New System.Windows.Forms.TextBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.txtID = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.txtNAME = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.GB1.SuspendLayout()
        Me.SuspendLayout()
        '
        'GB1
        '
        Me.GB1.Controls.Add(Me.CALCbtn)
        Me.GB1.Controls.Add(Me.txtTEST3)
        Me.GB1.Controls.Add(Me.txtTEST2)
        Me.GB1.Controls.Add(Me.Label5)
        Me.GB1.Controls.Add(Me.txtTEST1)
        Me.GB1.Controls.Add(Me.Label4)
        Me.GB1.Controls.Add(Me.txtID)
        Me.GB1.Controls.Add(Me.Label3)
        Me.GB1.Controls.Add(Me.Label2)
        Me.GB1.Controls.Add(Me.txtNAME)
        Me.GB1.Controls.Add(Me.Label1)
        Me.GB1.Location = New System.Drawing.Point(562, 12)
        Me.GB1.Name = "GB1"
        Me.GB1.Size = New System.Drawing.Size(226, 206)
        Me.GB1.TabIndex = 0
        Me.GB1.TabStop = False
        Me.GB1.Text = "FINAL REPORT"
        '
        'CALCbtn
        '
        Me.CALCbtn.Location = New System.Drawing.Point(113, 177)
        Me.CALCbtn.Name = "CALCbtn"
        Me.CALCbtn.Size = New System.Drawing.Size(77, 23)
        Me.CALCbtn.TabIndex = 3
        Me.CALCbtn.Text = "CALCULATE"
        Me.CALCbtn.UseVisualStyleBackColor = True
        '
        'txtTEST3
        '
        Me.txtTEST3.Location = New System.Drawing.Point(100, 140)
        Me.txtTEST3.Name = "txtTEST3"
        Me.txtTEST3.Size = New System.Drawing.Size(91, 20)
        Me.txtTEST3.TabIndex = 2
        '
        'txtTEST2
        '
        Me.txtTEST2.Location = New System.Drawing.Point(100, 114)
        Me.txtTEST2.Name = "txtTEST2"
        Me.txtTEST2.Size = New System.Drawing.Size(91, 20)
        Me.txtTEST2.TabIndex = 2
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(50, 143)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(44, 13)
        Me.Label5.TabIndex = 1
        Me.Label5.Text = "TEST 3"
        '
        'txtTEST1
        '
        Me.txtTEST1.Location = New System.Drawing.Point(100, 88)
        Me.txtTEST1.Name = "txtTEST1"
        Me.txtTEST1.Size = New System.Drawing.Size(91, 20)
        Me.txtTEST1.TabIndex = 2
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(50, 117)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(44, 13)
        Me.Label4.TabIndex = 1
        Me.Label4.Text = "TEST 2"
        '
        'txtID
        '
        Me.txtID.Location = New System.Drawing.Point(53, 54)
        Me.txtID.Name = "txtID"
        Me.txtID.Size = New System.Drawing.Size(91, 20)
        Me.txtID.TabIndex = 2
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(50, 91)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(44, 13)
        Me.Label3.TabIndex = 1
        Me.Label3.Text = "TEST 1"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(6, 57)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(24, 13)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "ID: "
        '
        'txtNAME
        '
        Me.txtNAME.Location = New System.Drawing.Point(53, 28)
        Me.txtNAME.Name = "txtNAME"
        Me.txtNAME.Size = New System.Drawing.Size(138, 20)
        Me.txtNAME.TabIndex = 2
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(6, 31)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(41, 13)
        Me.Label1.TabIndex = 1
        Me.Label1.Text = "NAME:"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.GB1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.GB1.ResumeLayout(False)
        Me.GB1.PerformLayout()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents GB1 As GroupBox
    Friend WithEvents txtTEST3 As TextBox
    Friend WithEvents txtTEST2 As TextBox
    Friend WithEvents Label5 As Label
    Friend WithEvents txtTEST1 As TextBox
    Friend WithEvents Label4 As Label
    Friend WithEvents txtID As TextBox
    Friend WithEvents Label3 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents txtNAME As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents CALCbtn As Button
End Class
