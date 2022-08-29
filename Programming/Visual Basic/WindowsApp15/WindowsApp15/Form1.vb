Public Class Form1
    Private lastButton As Button
    Private keyDictionary As New Dictionary(Of String, String)


    Private Sub outputTextBox_KeyDown(sender As Object,
      e As System.Windows.Forms.KeyEventArgs) _
      Handles OutputTextBox.KeyDown

        If Char.IsControl(Convert.ToChar(e.KeyCode)) OrElse
         IsFunctionOrArrowKey(e.KeyCode) Then


            Dim pressed =
               From currentControl In Me.Controls
               Where TypeOf currentControl Is Button AndAlso
                  keyDictionary.ContainsKey(
                     e.KeyCode.ToString()) AndAlso
                  keyDictionary(e.KeyCode.ToString()) =
                     CType(currentControl, Button).Text
               Select currentControl

            If pressed.Count > 0 Then
                ChangeColor(CType(pressed.First, Button))
            End If
        End If
    End Sub


    Private Sub outputTextBox_KeyPress(sender As Object,
      e As System.Windows.Forms.KeyPressEventArgs) _
      Handles OutputTextBox.KeyPress


        Dim pressed =
         From currentControl In Me.Controls
         Where TypeOf currentControl Is Button AndAlso
            e.KeyChar.ToString().ToUpper() =
               CType(currentControl, Button).Text
         Select currentControl

        If e.KeyChar = " " Then
            ChangeColor(SpaceButton)
        Else
            If pressed.Count > 0 Then
                ChangeColor(CType(pressed.First, Button))
            End If
        End If
    End Sub


    Private Sub outputTextBox_KeyUp(sender As Object,
      e As System.Windows.Forms.KeyEventArgs) _
      Handles OutputTextBox.KeyUp

        ResetColor()
    End Sub


    Private Sub ChangeColor(buttonPassed As Button)
        ResetColor()
        buttonPassed.BackColor = Color.Yellow
        lastButton = buttonPassed
    End Sub


    Private Sub ResetColor()
        If lastButton IsNot Nothing Then
            lastButton.BackColor = SystemColors.Control
        End If
    End Sub


    Private Sub TypingForm_Load(sender As System.Object,
      e As System.EventArgs) Handles MyBase.Load


        For i As Integer = 1 To 12
            keyDictionary.Add("F" & i, "F" & i)
        Next


        keyDictionary.Add("Back", "Backspace")
        keyDictionary.Add("Return", "Enter")
        keyDictionary.Add("ControlKey", "Ctrl")
        keyDictionary.Add("Menu", "Alt")
        keyDictionary.Add("Capital", "Caps Lock")
        keyDictionary.Add("ShiftKey", "Shift")
        keyDictionary.Add("Tab", "Tab")
        keyDictionary.Add("Up", "^")
        keyDictionary.Add("Down", "v")
        keyDictionary.Add("Left", "<")
        keyDictionary.Add("Right", ">")
    End Sub


    Function IsFunctionOrArrowKey(code As Keys) As Boolean
        Dim result As Boolean

        Select Case code
            Case Keys.F1 To Keys.F12
                result = True
            Case Keys.Up, Keys.Down, Keys.Left, Keys.Right
                result = True
            Case Else
                result = False
        End Select

        Return result
    End Function


    Private Sub fontMenuItem_Click(sender As System.Object,
      e As System.EventArgs) Handles FontMenuItem.Click

        Dim dialog As New FontDialog
        Dim result As DialogResult


        result = dialog.ShowDialog()


        If result = System.Windows.Forms.DialogResult.Cancel Then
            Return
        End If


        OutputTextBox.Font = dialog.Font
    End Sub


    Private Sub colorMenuItem_Click(sender As System.Object,
      e As System.EventArgs) Handles ColorMenuItem.Click

        Dim dialog As New ColorDialog
        Dim result As DialogResult

        dialog.FullOpen = True
        result = dialog.ShowDialog()


        If result = System.Windows.Forms.DialogResult.Cancel Then
            Return
        End If


        OutputTextBox.ForeColor = dialog.Color
    End Sub


    Private Sub clearMenuItem_Click(sender As System.Object,
      e As System.EventArgs) Handles ClearMenuItem.Click

        OutputTextBox.Clear()
    End Sub


    Private Sub invertMenuItem_Click(sender As System.Object,
      e As System.EventArgs) Handles InvertMenuItem.Click

        Dim temporaryColor As Color

        temporaryColor = OutputTextBox.BackColor
        OutputTextBox.BackColor = OutputTextBox.ForeColor
        OutputTextBox.ForeColor = temporaryColor
    End Sub
End Class

  