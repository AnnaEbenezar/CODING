<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form2
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
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
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Me.GB1 = New System.Windows.Forms.GroupBox()
        Me.EXITbtn = New System.Windows.Forms.Button()
        Me.txtMV = New System.Windows.Forms.TextBox()
        Me.txtavg = New System.Windows.Forms.TextBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.txttot = New System.Windows.Forms.TextBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.txtID2 = New System.Windows.Forms.TextBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.txtNAME2 = New System.Windows.Forms.TextBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.GB1.SuspendLayout()
        Me.SuspendLayout()
        '
        'GB1
        '
        Me.GB1.Controls.Add(Me.EXITbtn)
        Me.GB1.Controls.Add(Me.txtMV)
        Me.GB1.Controls.Add(Me.txtavg)
        Me.GB1.Controls.Add(Me.Label5)
        Me.GB1.Controls.Add(Me.txttot)
        Me.GB1.Controls.Add(Me.Label4)
        Me.GB1.Controls.Add(Me.txtID2)
        Me.GB1.Controls.Add(Me.Label3)
        Me.GB1.Controls.Add(Me.Label2)
        Me.GB1.Controls.Add(Me.txtNAME2)
        Me.GB1.Controls.Add(Me.Label1)
        Me.GB1.Location = New System.Drawing.Point(530, 12)
        Me.GB1.Name = "GB1"
        Me.GB1.Size = New System.Drawing.Size(258, 206)
        Me.GB1.TabIndex = 1
        Me.GB1.TabStop = False
        Me.GB1.Text = "FINAL REPORT"
        '
        'EXITbtn
        '
        Me.EXITbtn.Location = New System.Drawing.Point(139, 177)
        Me.EXITbtn.Name = "EXITbtn"
        Me.EXITbtn.Size = New System.Drawing.Size(75, 23)
        Me.EXITbtn.TabIndex = 3
        Me.EXITbtn.Text = "EXIT"
        Me.EXITbtn.UseVisualStyleBackColor = True
        '
        'txtMV
        '
        Me.txtMV.Location = New System.Drawing.Point(124, 140)
        Me.txtMV.Name = "txtMV"
        Me.txtMV.Size = New System.Drawing.Size(91, 20)
        Me.txtMV.TabIndex = 2
        '
        'txtavg
        '
        Me.txtavg.Location = New System.Drawing.Point(124, 114)
        Me.txtavg.Name = "txtavg"
        Me.txtavg.Size = New System.Drawing.Size(91, 20)
        Me.txtavg.TabIndex = 2
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(50, 143)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(71, 13)
        Me.Label5.TabIndex = 1
        Me.Label5.Text = "MAX VALUE:"
        '
        'txttot
        '
        Me.txttot.Location = New System.Drawing.Point(124, 88)
        Me.txttot.Name = "txttot"
        Me.txttot.Size = New System.Drawing.Size(91, 20)
        Me.txttot.TabIndex = 2
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(50, 117)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(61, 13)
        Me.Label4.TabIndex = 1
        Me.Label4.Text = "AVERAGE:"
        '
        'txtID2
        '
        Me.txtID2.Location = New System.Drawing.Point(53, 54)
        Me.txtID2.Name = "txtID2"
        Me.txtID2.Size = New System.Drawing.Size(91, 20)
        Me.txtID2.TabIndex = 2
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(50, 91)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(48, 13)
        Me.Label3.TabIndex = 1
        Me.Label3.Text = "TOTAL: "
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
        'txtNAME2
        '
        Me.txtNAME2.Location = New System.Drawing.Point(53, 28)
        Me.txtNAME2.Name = "txtNAME2"
        Me.txtNAME2.Size = New System.Drawing.Size(162, 20)
        Me.txtNAME2.TabIndex = 2
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
        'Form2
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.GB1)
        Me.Name = "Form2"
        Me.Text = "Form2"
        Me.GB1.ResumeLayout(False)
        Me.GB1.PerformLayout()
        Me.ResumeLayout(False)

    End Sub

    Friend WithEvents GB1 As GroupBox
    Friend WithEvents txtMV As TextBox
    Friend WithEvents txtavg As TextBox
    Friend WithEvents Label5 As Label
    Friend WithEvents txttot As TextBox
    Friend WithEvents Label4 As Label
    Friend WithEvents txtID2 As TextBox
    Friend WithEvents Label3 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents txtNAME2 As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents EXITbtn As Button
End Class
