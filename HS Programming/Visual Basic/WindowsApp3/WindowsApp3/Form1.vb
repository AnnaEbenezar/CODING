Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim Tot As Double
        Tot = Val(TB1.Text) + Val(TB2.Text) + Val(TB3.Text)

        Dim Avg As Double
        Avg = Tot / 3

        Total = Tot
        Average = Avg

        Form2.Show()
    End Sub
End Class
