Public Class Form1

    Private Sub enterButton_Click(sender As System.Object,
      e As System.EventArgs) Handles enterButton.Click

        Dim accessCode As Integer
        Dim message As String

        accessCode = Val(securityCodeTextBox.Text)
        securityCodeTextBox.Clear()

        Select Case accessCode
            Case Is < 10
                message = "Assistance Requested"
            Case 1645 To 1689
                message = "Technicians"
            Case 8345
                message = "Custodians"
            Case 9998, 1006 To 1008
                message = "Scientists"
            Case Else
                message = "Access Denied"
        End Select


        logEntryListBox.Items.Insert(0, Date.Now & "   " & message)
    End Sub


    Private Sub zeroButton_Click(sender As System.Object,
      e As System.EventArgs) Handles zeroButton.Click

        securityCodeTextBox.Text &= "0"
    End Sub

    Private Sub oneButton_Click(sender As System.Object,
      e As System.EventArgs) Handles oneButton.Click

        securityCodeTextBox.Text &= "1"
    End Sub


    Private Sub twoButton_Click(sender As System.Object,
      e As System.EventArgs) Handles twoButton.Click

        securityCodeTextBox.Text &= "2"
    End Sub


    Private Sub threeButton_Click(sender As System.Object,
      e As System.EventArgs) Handles threeButton.Click

        securityCodeTextBox.Text &= "3"
    End Sub


    Private Sub fourButton_Click(sender As System.Object,
      e As System.EventArgs) Handles fourButton.Click

        securityCodeTextBox.Text &= "4"
    End Sub


    Private Sub fiveButton_Click(sender As System.Object,
      e As System.EventArgs) Handles fiveButton.Click

        securityCodeTextBox.Text &= "5"
    End Sub


    Private Sub sixButton_Click(sender As System.Object,
      e As System.EventArgs) Handles sixButton.Click

        securityCodeTextBox.Text &= "6"
    End Sub


    Private Sub sevenButton_Click(sender As System.Object,
      e As System.EventArgs) Handles sevenButton.Click

        securityCodeTextBox.Text &= "7"
    End Sub


    Private Sub eightButton_Click(sender As System.Object,
      e As System.EventArgs) Handles eightButton.Click

        securityCodeTextBox.Text &= "8"
    End Sub


    Private Sub nineButton_Click(sender As System.Object,
      e As System.EventArgs) Handles nineButton.Click

        securityCodeTextBox.Text &= "9"
    End Sub


    Private Sub clearButton_Click(sender As System.Object,
      e As System.EventArgs) Handles clearButton.Click

        securityCodeTextBox.Clear()
    End Sub
End Class
