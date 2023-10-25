Public Class Form1
    Private Sub CALCbtn_Click(sender As Object, e As EventArgs) Handles CALCbtn.Click
        FNE = txtNAME.Text
        IDC = txtID.Text

        Tot = Val(txtTEST1.Text) + Val(txtTEST2.Text) + Val(txtTEST3.Text)
        Avg = Tot / 3

        Dim number1, number2, number3, max As Double
        number1 = txtTEST1.Text
        number2 = txtTEST2.Text
        number3 = txtTEST3.Text

        If number1 > number2 Then
            If number1 > number3 Then
                max = number1
            Else
                max = number3
            End If
        End If

        If number2 > number3 Then
            max = number2
        Else
            max = number3
        End If
        MxV = max


        Form2.Show()
        Me.Hide()
    End Sub
End Class
