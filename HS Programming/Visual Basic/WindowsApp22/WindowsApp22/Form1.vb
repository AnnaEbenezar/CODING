Public Class Form1
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click

        If ComboBox1.SelectedItem = "Baht" Then

            Dim ConAmount As Double
            Dim NoDoll As Double

            NoDoll = Val(TextBox1.Text)
            ConAmount = NoDoll * 31.69
            TextBox3.Text = ConAmount

        ElseIf ComboBox1.SelectedItem = "Yen" Then

            Dim ConAmount As Double
            Dim NoYen As Double

            NoYen = Val(TextBox1.Text)
            ConAmount = NoYen * 105.32
            TextBox3.Text = ConAmount

        ElseIf ComboBox1.SelectedItem = "Euro" Then

            Dim ConAmount As Double
            Dim NoEuro As Double

            NoEuro = Val(TextBox1.Text)
            ConAmount = NoEuro * 0.86
            TextBox3.Text = ConAmount

        End If

    End Sub
End Class
