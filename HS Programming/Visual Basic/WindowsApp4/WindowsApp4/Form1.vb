Public Class Form1
    Private Sub TextBox1_TextChanged(sender As Object, e As EventArgs) Handles TB2.LostFocus
        TB2.Text = 3.14 * (Val(TB1.Text) * Val(TB1.Text))
    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles TB3.LostFocus, TB4.LostFocus
        Dim Fah As Double
        If TB3.Text <> "" Then
            TB4.Text = ((TB3.Text) * (9 / 5)) + 32
        ElseIf TB4.Text <> "" Then
            Fah = Val(TB4.Text)
            TB3.Text = (Fah - 32) * (5 / 9)
        End If
    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click, Button1.Click
        TB3.Text = ""
        TB4.Text = ""
    End Sub
End Class

