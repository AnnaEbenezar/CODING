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
        Me.SubmitButton = New System.Windows.Forms.Button()
        Me.NextButton = New System.Windows.Forms.Button()
        Me.flagpicture = New System.Windows.Forms.PictureBox()
        Me.groupbox = New System.Windows.Forms.GroupBox()
        Me.countriesCombobox = New System.Windows.Forms.ComboBox()
        Me.feedbacklabel = New System.Windows.Forms.TextBox()
        CType(Me.flagpicture, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.groupbox.SuspendLayout()
        Me.SuspendLayout()
        '
        'SubmitButton
        '
        Me.SubmitButton.Location = New System.Drawing.Point(721, 209)
        Me.SubmitButton.Name = "SubmitButton"
        Me.SubmitButton.Size = New System.Drawing.Size(75, 23)
        Me.SubmitButton.TabIndex = 0
        Me.SubmitButton.Text = "SUBMIT"
        Me.SubmitButton.UseVisualStyleBackColor = True
        '
        'NextButton
        '
        Me.NextButton.Location = New System.Drawing.Point(721, 252)
        Me.NextButton.Name = "NextButton"
        Me.NextButton.Size = New System.Drawing.Size(75, 23)
        Me.NextButton.TabIndex = 1
        Me.NextButton.Text = "NEXT FLAG"
        Me.NextButton.UseVisualStyleBackColor = True
        '
        'flagpicture
        '
        Me.flagpicture.Location = New System.Drawing.Point(45, 19)
        Me.flagpicture.Name = "flagpicture"
        Me.flagpicture.Size = New System.Drawing.Size(108, 95)
        Me.flagpicture.TabIndex = 2
        Me.flagpicture.TabStop = False
        '
        'groupbox
        '
        Me.groupbox.Controls.Add(Me.flagpicture)
        Me.groupbox.Location = New System.Drawing.Point(329, 176)
        Me.groupbox.Name = "groupbox"
        Me.groupbox.Size = New System.Drawing.Size(200, 144)
        Me.groupbox.TabIndex = 3
        Me.groupbox.TabStop = False
        Me.groupbox.Text = "GroupBox1"
        '
        'countriesCombobox
        '
        Me.countriesCombobox.AutoCompleteCustomSource.AddRange(New String() {"RUSSIA", "AUSTRALIA", "UNITED STATES", "ITALY", "SOUTH AFRICA", "BRAZIL", "SPAIN"})
        Me.countriesCombobox.FormattingEnabled = True
        Me.countriesCombobox.Location = New System.Drawing.Point(570, 210)
        Me.countriesCombobox.Name = "countriesCombobox"
        Me.countriesCombobox.Size = New System.Drawing.Size(121, 21)
        Me.countriesCombobox.TabIndex = 4
        '
        'feedbacklabel
        '
        Me.feedbacklabel.Location = New System.Drawing.Point(570, 255)
        Me.feedbacklabel.Name = "feedbacklabel"
        Me.feedbacklabel.Size = New System.Drawing.Size(121, 20)
        Me.feedbacklabel.TabIndex = 5
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(898, 491)
        Me.Controls.Add(Me.feedbacklabel)
        Me.Controls.Add(Me.countriesCombobox)
        Me.Controls.Add(Me.groupbox)
        Me.Controls.Add(Me.NextButton)
        Me.Controls.Add(Me.SubmitButton)
        Me.Name = "Form1"
        Me.Text = "Form1"
        CType(Me.flagpicture, System.ComponentModel.ISupportInitialize).EndInit()
        Me.groupbox.ResumeLayout(False)
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents SubmitButton As Button
    Friend WithEvents NextButton As Button
    Friend WithEvents flagpicture As PictureBox
    Friend WithEvents groupbox As GroupBox
    Friend WithEvents countriesCombobox As ComboBox
    Friend WithEvents feedbacklabel As TextBox
End Class
