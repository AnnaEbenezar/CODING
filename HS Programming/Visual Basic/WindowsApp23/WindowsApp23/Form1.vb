Public Class Factorial
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click

        Dim Number As Integer = TextBox1.Text
        Dim Factorial As Integer = 1
        For i = 1 To Number
            Factorial = Factorial * i

        Next

        TextBox2.Text = Factorial
    End Sub
End Class


