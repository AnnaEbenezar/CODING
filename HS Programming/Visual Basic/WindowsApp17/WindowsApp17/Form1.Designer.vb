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
        Me.components = New System.ComponentModel.Container()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.CurrentTimeLabel = New System.Windows.Forms.TextBox()
        Me.dropOffDateTimePicker = New System.Windows.Forms.DateTimePicker()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.lasvegasTimeLabel = New System.Windows.Forms.TextBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.clockTimer = New System.Windows.Forms.Timer(Me.components)
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(514, 108)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(82, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Current Time In:"
        '
        'CurrentTimeLabel
        '
        Me.CurrentTimeLabel.Location = New System.Drawing.Point(602, 105)
        Me.CurrentTimeLabel.Name = "CurrentTimeLabel"
        Me.CurrentTimeLabel.Size = New System.Drawing.Size(125, 20)
        Me.CurrentTimeLabel.TabIndex = 1
        '
        'dropOffDateTimePicker
        '
        Me.dropOffDateTimePicker.CustomFormat = "hh:mm tt"
        Me.dropOffDateTimePicker.Format = System.Windows.Forms.DateTimePickerFormat.Time
        Me.dropOffDateTimePicker.Location = New System.Drawing.Point(627, 203)
        Me.dropOffDateTimePicker.Name = "dropOffDateTimePicker"
        Me.dropOffDateTimePicker.ShowUpDown = True
        Me.dropOffDateTimePicker.Size = New System.Drawing.Size(100, 20)
        Me.dropOffDateTimePicker.TabIndex = 2
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(514, 166)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(50, 13)
        Me.Label2.TabIndex = 0
        Me.Label2.Text = "Drop Off:"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(514, 209)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(107, 13)
        Me.Label3.TabIndex = 0
        Me.Label3.Text = "Enter Drop-Off Time: "
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(514, 311)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(71, 13)
        Me.Label4.TabIndex = 0
        Me.Label4.Text = "Delivery Time"
        '
        'lasvegasTimeLabel
        '
        Me.lasvegasTimeLabel.Location = New System.Drawing.Point(591, 308)
        Me.lasvegasTimeLabel.Name = "lasvegasTimeLabel"
        Me.lasvegasTimeLabel.Size = New System.Drawing.Size(136, 20)
        Me.lasvegasTimeLabel.TabIndex = 1
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(514, 264)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(153, 13)
        Me.Label5.TabIndex = 0
        Me.Label5.Text = "Express Shipping to Las Vegas"
        '
        'clockTimer
        '
        Me.clockTimer.Enabled = True
        Me.clockTimer.Interval = 1000
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(800, 450)
        Me.Controls.Add(Me.dropOffDateTimePicker)
        Me.Controls.Add(Me.lasvegasTimeLabel)
        Me.Controls.Add(Me.CurrentTimeLabel)
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
    Friend WithEvents CurrentTimeLabel As TextBox
    Friend WithEvents dropOffDateTimePicker As DateTimePicker
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents lasvegasTimeLabel As TextBox
    Friend WithEvents Label5 As Label
    Friend WithEvents clockTimer As Timer
End Class
