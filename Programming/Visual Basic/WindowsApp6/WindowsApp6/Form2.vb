Public Class Form2
    Private Sub Form2_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        txtTot1.Text = T1
        txtTot2.Text = T2
        txtTot3.Text = T3

        txtAvg1.Text = A1
        txtAvg2.Text = A2
        txtAvg3.Text = A3

        Dim MaxValue As Integer
        Dim a, b, c As Integer
        a = Val(txtTot1.Text)
        b = Val(txtTot2.Text)
        c = Val(txtTot3.Text)

        If a > b Then
            If a > c Then
                MaxValue = a
            Else
                MaxValue = c

            End If
        Else
            If b > c Then

                MaxValue = b
            Else
                MaxValue = c
            End If
        End If
        txtMaxV.Text = MaxValue

    End Sub
End Class